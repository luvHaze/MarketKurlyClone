package luv.zoey.layoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.actionbar_top.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation_view.setupWithNavController(findNavController(R.id.nav_host_fragment_container))
        bottom_navigation_view.setOnNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.d("[LOG]", "$item.title")

        when(item.title) {
            "홈" -> {
                findNavController(R.id.nav_host_fragment_container).navigate(R.id.homeFragment2)
                actionbar_logo.visibility = View.VISIBLE
                actionbar_textview.visibility = View.INVISIBLE
                return true
            }
            "카테고리" -> {
                findNavController(R.id.nav_host_fragment_container).navigate(R.id.categoryFragment)
                actionbar_logo.visibility = View.INVISIBLE
                actionbar_textview.text = "카테고리"
                actionbar_textview.visibility = View.VISIBLE
                return true
            }
            "마이컬리" -> {
                findNavController(R.id.nav_host_fragment_container).navigate(R.id.myKurlyFragment2)
                actionbar_logo.visibility = View.INVISIBLE
                actionbar_textview.text = "마이컬리"
                actionbar_textview.visibility = View.VISIBLE
                return true
            }
            "검색" -> {
                findNavController(R.id.nav_host_fragment_container).navigate(R.id.searchFragment)
                actionbar_logo.visibility = View.INVISIBLE
                actionbar_textview.text = "검색"
                actionbar_textview.visibility = View.VISIBLE
                return true
            }
        }
        return false
    }


}