package ehsan.haghdoust.kanban.view.fragmet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ehsan.haghdoust.kanban.databinding.ProjectsFragmentLayoutBinding
import ehsan.haghdoust.kanban.model.KanbanResponse
import ehsan.haghdoust.kanban.repository.webservice.ApiClient
import ehsan.haghdoust.kanban.repository.webservice.ApiInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProjectsFragment : Fragment() {

    private lateinit var binding: ProjectsFragmentLayoutBinding
    private val items = ApiClient().getServiceClient().create(ApiInterface::class.java).getCardInfo(filter = "", response_format = "")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = ProjectsFragmentLayoutBinding.inflate(layoutInflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {
            callProjectsWebService()
        }

        return binding.root
    }

    private suspend fun callProjectsWebService() {
        items.clone().enqueue(object: Callback<KanbanResponse> {
            override fun onResponse(call: Call<KanbanResponse>, response: Response<KanbanResponse>) {
                when (response.isSuccessful) {
                    true -> {

                    }
                    else -> {
                        ////
                    }
                }
            }

            override fun onFailure(call: Call<KanbanResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
}