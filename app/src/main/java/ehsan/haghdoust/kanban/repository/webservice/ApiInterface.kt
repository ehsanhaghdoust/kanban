package ehsan.haghdoust.kanban.repository.webservice

import ehsan.haghdoust.kanban.model.KanbanResponse
import retrofit2.Call
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterface {

    @Headers("Accept:application/json; Authorization:Bearer 2N6edq_uS3ACq89RhzN2yQtdT5aEhbKgaE5-P9BD3hc")
    @POST("/search")
    fun getCardInfo(@Query("filter") filter: String,
                    @Query("response_format") response_format: String): Call<KanbanResponse>
}