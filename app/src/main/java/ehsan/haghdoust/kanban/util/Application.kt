package ehsan.haghdoust.kanban.util

import android.app.Application
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import ehsan.haghdoust.kanban.model.KanbanResponse
import ehsan.haghdoust.kanban.repository.DataFetchedFromServer
import ehsan.haghdoust.kanban.repository.Util
import ehsan.haghdoust.kanban.repository.database.MeisterworkDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class Application : Application() {

    private val parentJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + parentJob)
    val database by lazy { MeisterworkDatabase.getInstance(context = applicationContext) }

    override fun onCreate() {
        super.onCreate()

//        database = MeisterworkDatabase.getInstance(context = applicationContext)

//        Util.loadDataFromServer(object : DataFetchedFromServer {
//            override fun onDataFetched(data: KanbanResponse) {
//                coroutineScope.launch {
//                    val projectEntities = data.result.projects.map { it.toEntity() }
//                    database.dao.insertProjects(projectEntities = projectEntities.toTypedArray())
//                }
//            }
//
//            override fun onFailure(error: Error) {
//                print(error.message)
//            }
//        })
    }
}