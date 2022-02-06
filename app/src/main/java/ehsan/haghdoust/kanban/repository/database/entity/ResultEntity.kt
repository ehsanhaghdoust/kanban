package ehsan.haghdoust.kanban.repository.database.entity

import androidx.room.Entity
import com.google.gson.annotations.SerializedName


@Entity
data class ResultEntity(@SerializedName("tasks") var tasks: List<TaskEntity>,
                        @SerializedName("sectionEntities") var sectionEntities: List<SectionEntity>,
                        @SerializedName("projectEntities") var projectEntities: List<ProjectEntity>)
