package ehsan.haghdoust.kanban.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName


@Entity
data class Paging(@SerializedName("total_results") var totalResults: Int? = null,
                  @SerializedName("total_pages") var totalPages: Int? = null,
                  @SerializedName("current_page") var currentPage: Int? = null,
                  @SerializedName("results_per_page") var resultsPerPage: Int? = null)
