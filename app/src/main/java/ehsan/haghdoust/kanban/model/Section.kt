package ehsan.haghdoust.kanban.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Section(@SerializedName("id") var id: Int? = null,
                   @SerializedName("name") var name: String? = null,
                   @SerializedName("indicator") var indicator: Int? = null,
                   @SerializedName("sequence") var sequence: Int? = null,
                   @SerializedName("project_id") var projectId: Int? = null,
                   @SerializedName("created_at") var createdAt: String? = null,
                   @SerializedName("updated_at") var updatedAt: String? = null,
                   @SerializedName("status") var status: Int? = null,
                   @SerializedName("color") var color: String? = null,
                   @SerializedName("description") var description: String? = null,
                   @SerializedName("limit") var limit: String? = null,
                   @SerializedName("object_actions_count") var objectActionsCount: Int? = null,
                   @SerializedName("recurring_actions_count") var recurringActionsCount: Int? = null)