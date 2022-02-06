package ehsan.haghdoust.kanban.model

import com.google.gson.annotations.SerializedName


data class KanbanResponse(@SerializedName(value = "results") var result: Result,
                          @SerializedName(value = "paging") var paging: Paging)
