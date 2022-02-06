package ehsan.haghdoust.kanban.repository.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class TaskEntity(@PrimaryKey @ColumnInfo(name = "id") var id: Int? = null,
                      @ColumnInfo(name = "name") var name: String? = null,
                      @ColumnInfo(name = "sequence") var sequence: Int? = null,
                      @ColumnInfo(name = "priority") var priority: String? = null,
                      @ColumnInfo(name = "status") var status: Int? = null,
                      @ColumnInfo(name = "repeat") var repeat: String? = null,
                      @ColumnInfo(name = "notes") var notes: String? = null,
                      @ColumnInfo(name = "flagged") var flagged: String? = null,
                      @ColumnInfo(name = "assigned_to_id") var assignedToId: String? = null,
                      @ColumnInfo(name = "tracked_time") var trackedTime: Int? = null,
                      @ColumnInfo(name = "created_by_id") var createdById: Int? = null,
                      @ColumnInfo(name = "created_by_origin") var createdByOrigin: String? = null,
                      @ColumnInfo(name = "reminder") var reminder: String? = null,
                      @ColumnInfo(name = "created_at") var createdAt: String? = null,
                      @ColumnInfo(name = "updated_at") var updatedAt: String? = null,
                      @ColumnInfo(name = "section_id") var sectionId: Int? = null,
                      @ColumnInfo(name = "token") var token: String? = null,
                      @ColumnInfo(name = "comments_count") var commentsCount: Int? = null,
                      @ColumnInfo(name = "status_changed_by_id") var statusChangedById: Int? = null,
                      @ColumnInfo(name = "due") var due: String? = null,
                      @ColumnInfo(name = "attachments_count") var attachmentsCount: Int? = null,
                      @ColumnInfo(name = "closed_cl_items_count") var closedClItemsCount: Int? = null,
                      @ColumnInfo(name = "total_cl_items_count") var totalClItemsCount: Int? = null,
                      @ColumnInfo(name = "status_updated_at") var statusUpdatedAt: String? = null,
                      @ColumnInfo(name = "meta_information") var metaInformation: String? = null,
                      @ColumnInfo(name = "attachment_id") var attachmentId: String? = null,
                      @ColumnInfo(name = "completed_at") var completedAt: String? = null)
