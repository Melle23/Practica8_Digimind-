package molina.esmeralda.mydigimind.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import molina.esmeralda.mydigimind.R
import molina.esmeralda.mydigimind.databinding.FragmentDashboardBinding
import molina.esmeralda.mydigimind.ui.home.HomeViewModel

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        return root
    }
}