package ehsan.haghdoust.kanban.repository

import com.google.gson.JsonObject
import ehsan.haghdoust.kanban.model.KanbanResponse
import ehsan.haghdoust.kanban.repository.webservice.ApiClient
import ehsan.haghdoust.kanban.repository.webservice.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object Util {

    private val client = ApiClient().getServiceClient().create(ApiInterface::class.java)
    private val jsonObject = JsonObject().apply {
        addProperty("text", "*")
    }

    fun loadDataFromServer(dataFetchedInterface: DataFetchedFromServer) {

        val cardInfoCaller = client.getCardInfo(filter = jsonObject.toString(), response_format = "object")
        cardInfoCaller.clone().enqueue(object : Callback<KanbanResponse> {
            override fun onResponse(call: Call<KanbanResponse>, responseEntity: Response<KanbanResponse>) {
                when (responseEntity.isSuccessful) {
                    true -> {
                        dataFetchedInterface.onDataFetched(responseEntity.body()!!)
                    }
                    else -> {
                        dataFetchedInterface.onFailure(error = Error("Internet Fucked-up"))
                    }
                }
            }

            override fun onFailure(call: Call<KanbanResponse>, t: Throwable) {
                t.printStackTrace()
//                dataFetchedInterface.onFailure(error = Error(message = t.message, cause = t))
                dataFetchedInterface.onFailure(error = Error(t.message))
            }
        })
    }
}

interface DataFetchedFromServer {
    fun onDataFetched(data: KanbanResponse)
    fun onFailure(error: Error)
}