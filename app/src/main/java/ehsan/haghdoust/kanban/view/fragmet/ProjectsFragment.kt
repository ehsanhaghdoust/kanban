package ehsan.haghdoust.kanban.view.fragmet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import ehsan.haghdoust.kanban.databinding.ProjectsFragmentLayoutBinding
import ehsan.haghdoust.kanban.repository.database.MeisterworkDatabase
import ehsan.haghdoust.kanban.repository.database.entity.ProjectEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProjectsFragment : Fragment() {

    private lateinit var binding: ProjectsFragmentLayoutBinding

    private val dataFromDataBase = MutableLiveData<List<ProjectEntity>?>()
    private val database by lazy { MeisterworkDatabase.getInstance(requireContext()) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = ProjectsFragmentLayoutBinding.inflate(layoutInflater, container, false)

        dataFromDataBase.observe(viewLifecycleOwner) {
            if (!it.isNullOrEmpty()) {
                print(it)
            }
        }

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
}