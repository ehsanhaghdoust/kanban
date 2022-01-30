package ehsan.haghdoust.kanban.view.fragmet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ehsan.haghdoust.kanban.R
import ehsan.haghdoust.kanban.databinding.TasksFragmentLayoutBinding

class TasksFragment : Fragment() {

    lateinit var binding: TasksFragmentLayoutBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = TasksFragmentLayoutBinding.inflate(layoutInflater, container, false)

        binding.button.setOnClickListener {
            this@TasksFragment.findNavController()
                    .navigate(R.id.action_tasksFragment_to_projectsFragment)
        }
        return  binding.root
    }
}