package ehsan.haghdoust.kanban.repository.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ehsan.haghdoust.kanban.model.Project
import ehsan.haghdoust.kanban.model.Results
import ehsan.haghdoust.kanban.model.Section
import ehsan.haghdoust.kanban.model.Task

@Database(entities = [Results::class, Project::class, Section::class,Task::class], version = 1, exportSchema = false)
abstract class MeiterworkDatabase: RoomDatabase() {

    abstract val dao: DAO

    companion object {
        @Volatile
        private var databaseInstance: MeiterworkDatabase? = null

        fun getInstance(context: Context) : MeiterworkDatabase {
            synchronized(this) {
                if (databaseInstance == null) {
                    databaseInstance = Room.databaseBuilder(context,MeiterworkDatabase::class.java, "MeiterworkDatabase").build()
                }
                return databaseInstance!!
            }
        }
    }

}