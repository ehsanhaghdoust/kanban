package ehsan.haghdoust.kanban.repository.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ehsan.haghdoust.kanban.repository.database.entity.ProjectEntity
import ehsan.haghdoust.kanban.repository.database.entity.ResultEntity
import ehsan.haghdoust.kanban.repository.database.entity.SectionEntity
import ehsan.haghdoust.kanban.repository.database.entity.TaskEntity

@Database(entities = [ResultEntity::class, ProjectEntity::class, SectionEntity::class, TaskEntity::class], version = 1, exportSchema = false)
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