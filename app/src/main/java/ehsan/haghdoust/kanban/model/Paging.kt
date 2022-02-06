package ehsan.haghdoust.kanban.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName


data class Paging(@SerializedName( value = "total_results") var totalResults: Int? = null,
                  @SerializedName( value = "total_pages") var totalPages: Int? = null,
                  @SerializedName( value = "current_page") var currentPage: Int? = null,
                  @SerializedName( value = "results_per_page") var resultsPerPage: Int? = null)
