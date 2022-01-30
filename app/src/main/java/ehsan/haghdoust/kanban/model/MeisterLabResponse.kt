package ehsan.haghdoust.kanban.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName


@Entity
data class KanbanResponse(@SerializedName("results") var results: Results,
                              @SerializedName("paging") var paging: Paging)
