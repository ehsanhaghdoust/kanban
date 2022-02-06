package ehsan.haghdoust.kanban.repository.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class SectionEntity(@PrimaryKey @ColumnInfo(name = "id") var id: Int? = null,
                         @ColumnInfo(name = "name") var name: String? = null,
                         @ColumnInfo(name = "indicator") var indicator: Int? = null,
                         @ColumnInfo(name = "sequence") var sequence: Int? = null,
                         @ColumnInfo(name = "project_id") var projectId: Int? = null,
                         @ColumnInfo(name = "created_at") var createdAt: String? = null,
                         @ColumnInfo(name = "updated_at") var updatedAt: String? = null,
                         @ColumnInfo(name = "status") var status: Int? = null,
                         @ColumnInfo(name = "color") var color: String? = null,
                         @ColumnInfo(name = "description") var description: String? = null,
                         @ColumnInfo(name = "limit") var limit: String? = null,
                         @ColumnInfo(name = "object_actions_count") var objectActionsCount: Int? = null,
                         @ColumnInfo(name = "recurring_actions_count") var recurringActionsCount: Int? = null)