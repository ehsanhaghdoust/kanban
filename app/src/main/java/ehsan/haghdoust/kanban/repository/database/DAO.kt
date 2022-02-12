package ehsan.haghdoust.kanban.repository.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ehsan.haghdoust.kanban.repository.database.entity.ProjectEntity
import ehsan.haghdoust.kanban.repository.database.entity.SectionEntity
import ehsan.haghdoust.kanban.repository.database.entity.TaskEntity

@Dao
public interface DAO {

    // INSERT
    @Insert
    suspend fun insertTask(taskEntity: TaskEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTasks(taskEntities: List<TaskEntity>)


    @Insert
    suspend fun insertSection(sectionEntity: SectionEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSections(sectionEntities: List<SectionEntity>)


    @Insert
    suspend fun insertProject(projectEntity: ProjectEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProjects(projectEntities: List<ProjectEntity>)


    // UPDATE


    // DELETE


    // QUERY
//    @Query("SELECT * from KanbanResponseEntity")
//    fun getKanbanResponse(): KanbanResponseEntity?

    @Query("SELECT * from ProjectEntity")
    fun getProjects(): LiveData<List<ProjectEntity>>

    @Query("SELECT * from SectionEntity")
    fun getSection(): LiveData<List<SectionEntity>>

    @Query("SELECT * from TaskEntity")
    fun getTasks(): LiveData<List<TaskEntity>>
}