package ehsan.haghdoust.kanban.repository.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity
data class ProjectEntity(@ColumnInfo(name = "id") var id: Int? = null,
                         @ColumnInfo(name = "type") var type: String? = null,
                         @ColumnInfo(name = "name") var name: String? = null,
                         @ColumnInfo(name = "status") var status: Int? = null,
                         @ColumnInfo(name = "notes") var notes: String? = null,
                         @ColumnInfo(name = "created_at") var createdAt: String? = null,
                         @ColumnInfo(name = "updated_at") var updatedAt: String? = null,
                         @ColumnInfo(name = "color") var color: String? = null,
                         @ColumnInfo(name = "token") var token: String? = null,
                         @ColumnInfo(name = "share_mode") var shareMode: Int? = null,
                         @ColumnInfo(name = "mail_token") var mailToken: String? = null,
                         @ColumnInfo(name = "tasks_active_count") var tasksActiveCount: Int? = null,
                         @ColumnInfo(name = "tasks_archive_count") var tasksArchiveCount: Int? = null,
                         @ColumnInfo(name = "tasks_trash_count") var tasksTrashCount: Int? = null,
                         @ColumnInfo(name = "tasks_complete_count") var tasksCompleteCount: Int? = null,
                         @ColumnInfo(name = "share_token") var shareToken: String? = null,
                         @ColumnInfo(name = "share_token_enabled") var shareTokenEnabled: Boolean? = null,
                         @ColumnInfo(name = "team_id") var teamId: Int? = null,
                         @ColumnInfo(name = "roles_enabled") var rolesEnabled: Boolean? = null,
                         @ColumnInfo(name = "creator_id") var creatorId: String? = null,
                         @ColumnInfo(name = "creator_name") var creatorName: String? = null,
                         @ColumnInfo(name = "trashed_at") var trashedAt: String? = null)