package ehsan.haghdoust.kanban.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName



data class Result(@SerializedName("tasks") var tasks: List<Task>,
                  @SerializedName("sections") var sections: List<Section>,
                  @SerializedName("projects") var projects: List<Project>)
