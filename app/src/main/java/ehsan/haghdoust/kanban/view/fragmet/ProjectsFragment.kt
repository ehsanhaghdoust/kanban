package ehsan.haghdoust.kanban.view.fragmet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ehsan.haghdoust.kanban.databinding.ProjectsFragmentLayoutBinding
import ehsan.haghdoust.kanban.repository.database.entity.KanbanResponseEntity
import ehsan.haghdoust.kanban.repository.webservice.ApiClient
import ehsan.haghdoust.kanban.repository.webservice.ApiInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.google.gson.JsonObject
import ehsan.haghdoust.kanban.model.GetInitialDataRequest
import ehsan.haghdoust.kanban.model.KanbanResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProjectsFragment : Fragment() {

    private lateinit var binding: ProjectsFragmentLayoutBinding
    private val client = ApiClient().getServiceClient().create(ApiInterface::class.java)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = ProjectsFragmentLayoutBinding.inflate(layoutInflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {
            callProjectsWebService()
        }

        return binding.root
    }

    private suspend fun callProjectsWebService() {
        val jsonObject = JsonObject()
        jsonObject.addProperty("text", "*")
        val cardInfoCaller = client.getCardInfo(filter = jsonObject.toString(), response_format = "object")
        cardInfoCaller.clone().enqueue(object: Callback<KanbanResponse> {
            override fun onResponse(call: Call<KanbanResponse>, responseEntity: Response<KanbanResponse>) {
                when (responseEntity.isSuccessful) {
                    true -> {

                    }
                    else -> {
                        ////
                    }
                }
            }

            override fun onFailure(call: Call<KanbanResponse>, t: Throwable) {
                t.printStackTrace()
            }

        })


//        cardInfoCaller.clone().enqueue(object: Callback<JsonObject> {
//            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
//                when (response.isSuccessful) {
//                    true -> {
//                    }
//                    else -> {
//                        ////
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//
//        })

    }
}