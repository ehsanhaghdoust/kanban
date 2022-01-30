package ehsan.haghdoust.kanban.repository.database

import androidx.room.Dao
import androidx.room.Query
import ehsan.haghdoust.kanban.model.KanbanResponse
import ehsan.haghdoust.kanban.model.Project
import ehsan.haghdoust.kanban.model.Section
import ehsan.haghdoust.kanban.model.Task

@Dao
interface DAO {

    @Query("SELECT * from KanbanResponse")
    fun getKanbanResponse(): KanbanResponse?

    @Query("SELECT * from Project")
    fun getProjects(): List<Project>

    @Query("SELECT * from Section")
    fun getSection(): List<Section>


    @Query("SELECT * from Task")
    fun getTasks(): List<Task>
}