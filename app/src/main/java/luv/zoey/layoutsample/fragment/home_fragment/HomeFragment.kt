package luv.zoey.layoutsample.fragment.home_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_home.*
import luv.zoey.layoutsample.R
import luv.zoey.layoutsample.fragment.home_fragment.adapter.tabViewPagerAdapter


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        home_tab_viewPager.adapter =
            tabViewPagerAdapter(
                this
            )
        val tablayoutMediator = TabLayoutMediator(home_tablayout, home_tab_viewPager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 ->  tab.text = "컬리추천"
                    1 ->  tab.text = "신상품"
                    2 ->  tab.text = "베스트"
                    3 ->  tab.text = "알뜰쇼핑"
                    4 ->  tab.text = "이벤트"
                }
            }
        ).attach()

    }

}