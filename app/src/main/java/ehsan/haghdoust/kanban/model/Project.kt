package ehsan.haghdoust.kanban.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName


@Entity
data class Project(@SerializedName("id") var id: Int? = null,
                   @SerializedName("type") var type: String? = null,
                   @SerializedName("name") var name: String? = null,
                   @SerializedName("status") var status: Int? = null,
                   @SerializedName("notes") var notes: String? = null,
                   @SerializedName("created_at") var createdAt: String? = null,
                   @SerializedName("updated_at") var updatedAt: String? = null,
                   @SerializedName("color") var color: String? = null,
                   @SerializedName("token") var token: String? = null,
                   @SerializedName("share_mode") var shareMode: Int? = null,
                   @SerializedName("mail_token") var mailToken: String? = null,
                   @SerializedName("tasks_active_count") var tasksActiveCount: Int? = null,
                   @SerializedName("tasks_archive_count") var tasksArchiveCount: Int? = null,
                   @SerializedName("tasks_trash_count") var tasksTrashCount: Int? = null,
                   @SerializedName("tasks_complete_count") var tasksCompleteCount: Int? = null,
                   @SerializedName("share_token") var shareToken: String? = null,
                   @SerializedName("share_token_enabled") var shareTokenEnabled: Boolean? = null,
                   @SerializedName("team_id") var teamId: Int? = null,
                   @SerializedName("roles_enabled") var rolesEnabled: Boolean? = null,
                   @SerializedName("creator_id") var creatorId: String? = null,
                   @SerializedName("creator_name") var creatorName: String? = null,
                   @SerializedName("trashed_at") var trashedAt: String? = null)