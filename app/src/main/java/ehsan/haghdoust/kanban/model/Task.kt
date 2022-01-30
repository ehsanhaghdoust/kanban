package ehsan.haghdoust.kanban.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Task(@SerializedName("id") var id: Int? = null,
                @SerializedName("name") var name: String? = null,
                @SerializedName("sequence") var sequence: Int? = null,
                @SerializedName("priority") var priority: String? = null,
                @SerializedName("status") var status: Int? = null,
                @SerializedName("repeat") var repeat: String? = null,
                @SerializedName("notes") var notes: String? = null,
                @SerializedName("flagged") var flagged: String? = null,
                @SerializedName("assigned_to_id") var assignedToId: String? = null,
                @SerializedName("tracked_time") var trackedTime: Int? = null,
                @SerializedName("created_by_id") var createdById: Int? = null,
                @SerializedName("created_by_origin") var createdByOrigin: String? = null,
                @SerializedName("reminder") var reminder: String? = null,
                @SerializedName("created_at") var createdAt: String? = null,
                @SerializedName("updated_at") var updatedAt: String? = null,
                @SerializedName("section_id") var sectionId: Int? = null,
                @SerializedName("token") var token: String? = null,
                @SerializedName("comments_count") var commentsCount: Int? = null,
                @SerializedName("status_changed_by_id") var statusChangedById: Int? = null,
                @SerializedName("due") var due: String? = null,
                @SerializedName("attachments_count") var attachmentsCount: Int? = null,
                @SerializedName("closed_cl_items_count") var closedClItemsCount: Int? = null,
                @SerializedName("total_cl_items_count") var totalClItemsCount: Int? = null,
                @SerializedName("status_updated_at") var statusUpdatedAt: String? = null,
                @SerializedName("meta_information") var metaInformation: String? = null,
                @SerializedName("attachment_id") var attachmentId: String? = null,
                @SerializedName("completed_at") var completedAt: String? = null)
