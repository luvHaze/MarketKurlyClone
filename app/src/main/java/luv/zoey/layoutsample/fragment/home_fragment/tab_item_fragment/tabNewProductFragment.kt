package luv.zoey.layoutsample.fragment.home_fragment.tab_item_fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_tab_new_product.*
import luv.zoey.layoutsample.R
import luv.zoey.layoutsample.fragment.home_fragment.adapter.NewProductRecyclerViewAdapter
import luv.zoey.layoutsample.model.Product

class tabNewProductFragment : Fragment(R.layout.fragment_tab_new_product) {

    private var itemList = ArrayList<Product>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        for (i in 1..20) {
            itemList.add(
                Product(
                    "Product $i",
                    "${i * 1000}",
                    "https://picsum.photos/id/$i/200/300"
                )
            )
        }

        recyclerViewInit()
    }

    fun recyclerViewInit() {
        val adapter =
            NewProductRecyclerViewAdapter()
        val layoutManager =
            GridLayoutManager(activity?.applicationContext, 2, GridLayoutManager.VERTICAL, false)

        newproduct_recyclerview.layoutManager = layoutManager
        newproduct_recyclerview.adapter = adapter
        adapter.submitList(itemList)
    }
}