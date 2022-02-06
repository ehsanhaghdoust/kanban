package ehsan.haghdoust.kanban.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Section(@SerializedName( value = "id") var id: Int? = null,
                   @SerializedName( value = "name") var name: String? = null,
                   @SerializedName( value = "indicator") var indicator: Int? = null,
                   @SerializedName( value = "sequence") var sequence: Int? = null,
                   @SerializedName( value = "project_id") var projectId: Int? = null,
                   @SerializedName( value = "created_at") var createdAt: String? = null,
                   @SerializedName( value = "updated_at") var updatedAt: String? = null,
                   @SerializedName( value = "status") var status: Int? = null,
                   @SerializedName( value = "color") var color: String? = null,
                   @SerializedName( value = "description") var description: String? = null,
                   @SerializedName( value = "limit") var limit: String? = null,
                   @SerializedName( value = "object_actions_count") var objectActionsCount: Int? = null,
                   @SerializedName( value = "recurring_actions_count") var recurringActionsCount: Int? = null)