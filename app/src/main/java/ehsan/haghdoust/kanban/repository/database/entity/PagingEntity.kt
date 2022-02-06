package ehsan.haghdoust.kanban.repository.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity
data class PagingEntity(@ColumnInfo(name = "total_results") var totalResults: Int? = null,
                        @ColumnInfo(name = "total_pages") var totalPages: Int? = null,
                        @ColumnInfo(name = "current_page") var currentPage: Int? = null,
                        @ColumnInfo(name = "results_per_page") var resultsPerPage: Int? = null)
