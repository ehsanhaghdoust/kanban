package ehsan.haghdoust.kanban.model

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

data class GetInitialDataRequest(@SerializedName("filter") val filter: JsonObject,
                                @SerializedName("response_format") val response_format: String)