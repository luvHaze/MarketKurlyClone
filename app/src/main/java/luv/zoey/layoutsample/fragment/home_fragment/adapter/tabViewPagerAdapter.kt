package luv.zoey.layoutsample.fragment.home_fragment.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import luv.zoey.layoutsample.fragment.home_fragment.tab_item_fragment.*

class tabViewPagerAdapter(frag: Fragment) : FragmentStateAdapter(frag) {

    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return tabCurlyRecFragment()
            1 -> return tabNewProductFragment()
            2 -> return tabBestFragment()
            3 -> return tabAlShoppingFragment()
            4 -> return tabEventFragment()

            else -> return tabCurlyRecFragment()
        }
    }
}