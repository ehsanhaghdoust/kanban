package ehsan.haghdoust.kanban.repository.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ehsan.haghdoust.kanban.model.Paging
import ehsan.haghdoust.kanban.repository.database.entity.*

@Dao
interface DAO {

    // INSERT
    @Insert
    fun insertTask(taskEntity: TaskEntity)

    @Insert
    fun insertSection(sectionEntity: SectionEntity)

    @Insert
    fun insertResult(resultEntity: ResultEntity)

    @Insert
    fun insertProject(projectEntity: ProjectEntity)

    @Insert
    fun insertPaging(paging: Paging)

    // UPDATE


    // DELETE

    // QUERY

    @Query("SELECT * from KanbanResponseEntity")
    fun getKanbanResponse(): KanbanResponseEntity?

    @Query("SELECT * from ProjectEntity")
    fun getProjects(): List<ProjectEntity>

    @Query("SELECT * from SectionEntity")
    fun getSection(): List<SectionEntity>


    @Query("SELECT * from TaskEntity")
    fun getTasks(): List<TaskEntity>
}