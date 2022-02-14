package ehsan.haghdoust.kanban.view.fragmet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import ehsan.haghdoust.kanban.R
import ehsan.haghdoust.kanban.databinding.ProjectsFragmentLayoutBinding
import ehsan.haghdoust.kanban.model.KanbanResponse
import ehsan.haghdoust.kanban.repository.DataFetchedFromServer
import ehsan.haghdoust.kanban.repository.Util
import ehsan.haghdoust.kanban.repository.database.MeisterworkDatabase
import ehsan.haghdoust.kanban.repository.database.entity.ProjectEntity
import ehsan.haghdoust.kanban.view.adpater.AdapterItemClicked
import ehsan.haghdoust.kanban.view.adpater.ProjectsAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class ProjectsFragment : Fragment() {

    private lateinit var binding: ProjectsFragmentLayoutBinding
    private val dataFromDataBase = MutableLiveData<Array<ProjectEntity>?>()
    private val database by lazy { MeisterworkDatabase.getInstance(requireContext()) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = ProjectsFragmentLayoutBinding.inflate(layoutInflater, container, false)

        dataFromDataBase.observe(viewLifecycleOwner) {
            if (!it.isNullOrEmpty()) {
                setupProjectsAdapter()
            }
        }

//        getDataFromServer()

        CoroutineScope(Dispatchers.IO).launch {
            val retrieved = database.dao.getProjects()
            CoroutineScope(Dispatchers.Main).launch {
                retrieved.observe(viewLifecycleOwner) {
                    dataFromDataBase.postValue(it)
                }
            }
        }
        return binding.root
    }

    private fun setupProjectsAdapter() {
        binding.projectsRecyclerView.adapter = ProjectsAdapter(dataFromDataBase.value!!.map { it.toProjectModel() }.toTypedArray(), clickInterface = object: AdapterItemClicked{
            override fun onClick() {
                this@ProjectsFragment.findNavController().navigate(R.id.action_projectsFragment_to_sectionsFragment)
            }
        })
        binding.projectsRecyclerView.layoutManager = LinearLayoutManager(context)
    }

    private fun getDataFromServer() {
        Util.loadDataFromServer(object : DataFetchedFromServer {
            override fun onDataFetched(data: KanbanResponse) {
                CoroutineScope(Dispatchers.Main).launch {
                    val projectEntities = data.result.projects.map { it.toEntity() }
                    database.dao.insertProjects(projectEntities = projectEntities.toTypedArray())
                }
            }

            override fun onFailure(error: Error) {
                print(error.message)
            }
        })
    }
}