package ehsan.haghdoust.kanban.repository.webservice

import com.google.gson.JsonObject
import ehsan.haghdoust.kanban.model.GetInitialDataRequest
import ehsan.haghdoust.kanban.model.KanbanResponse
import ehsan.haghdoust.kanban.repository.database.entity.KanbanResponseEntity
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @Headers("Authorization:Bearer 2N6edq_uS3ACq89RhzN2yQtdT5aEhbKgaE5-P9BD3hc")
    @POST("/search")
    fun getCardInfo(@Query("filter") filter: String,
                    @Query("response_format") response_format: String): Call<KanbanResponse>



}