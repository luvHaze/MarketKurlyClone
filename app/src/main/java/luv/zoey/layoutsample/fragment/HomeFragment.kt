package luv.zoey.layoutsample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*
import luv.zoey.layoutsample.R


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

        home_tablayout.addTab(home_tablayout.newTab().setText("컬리추천"))
        home_tablayout.addTab(home_tablayout.newTab().setText("신상품"))
        home_tablayout.addTab(home_tablayout.newTab().setText("베스트"))
        home_tablayout.addTab(home_tablayout.newTab().setText("알뜰쇼핑"))
        home_tablayout.addTab(home_tablayout.newTab().setText("이벤트"))
    }




}