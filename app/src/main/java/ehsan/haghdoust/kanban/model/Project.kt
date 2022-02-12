package ehsan.haghdoust.kanban.model

import com.google.gson.annotations.SerializedName
import ehsan.haghdoust.kanban.repository.database.entity.ProjectEntity


data class Project(@SerializedName(value = "id") var id: Int? = null,
                   @SerializedName(value = "type") var type: String? = null,
                   @SerializedName(value = "name") var name: String? = null,
                   @SerializedName(value = "status") var status: Int? = null,
                   @SerializedName(value = "notes") var notes: String? = null,
                   @SerializedName(value = "created_at") var createdAt: String? = null,
                   @SerializedName(value = "updated_at") var updatedAt: String? = null,
                   @SerializedName(value = "color") var color: String? = null,
                   @SerializedName(value = "token") var token: String? = null,
                   @SerializedName(value = "share_mode") var shareMode: Int? = null,
                   @SerializedName(value = "mail_token") var mailToken: String? = null,
                   @SerializedName(value = "tasks_active_count") var tasksActiveCount: Int? = null,
                   @SerializedName(value = "tasks_archive_count") var tasksArchiveCount: Int? = null,
                   @SerializedName(value = "tasks_trash_count") var tasksTrashCount: Int? = null,
                   @SerializedName(value = "tasks_complete_count") var tasksCompleteCount: Int? = null,
                   @SerializedName(value = "share_token") var shareToken: String? = null,
                   @SerializedName(value = "share_token_enabled") var shareTokenEnabled: Boolean? = null,
                   @SerializedName(value = "team_id") var teamId: Int? = null,
                   @SerializedName(value = "roles_enabled") var rolesEnabled: Boolean? = null,
                   @SerializedName(value = "creator_id") var creatorId: String? = null,
                   @SerializedName(value = "creator_name") var creatorName: String? = null,
                   @SerializedName(value = "trashed_at") var trashedAt: String? = null) {
    fun toEntity(): ProjectEntity {
        return ProjectEntity(id = this.id,
                type = this.type,
                name = this.name,
                status = this.status,
                notes = this.notes,
                createdAt = this.createdAt,
                updatedAt = this.updatedAt,
                color = this.color,
                token = this.token,
                shareMode = this.shareMode,
                mailToken = this.mailToken,
                tasksActiveCount = this.tasksActiveCount,
                tasksArchiveCount = this.tasksArchiveCount,
                tasksTrashCount = this.tasksTrashCount,
                tasksCompleteCount = this.tasksCompleteCount,
                shareToken = this.shareToken,
                shareTokenEnabled = this.shareTokenEnabled,
                teamId = this.teamId,
                rolesEnabled = this.rolesEnabled,
                creatorId = this.creatorId,
                creatorName = this.creatorName,
                trashedAt = this.trashedAt)
    }
}