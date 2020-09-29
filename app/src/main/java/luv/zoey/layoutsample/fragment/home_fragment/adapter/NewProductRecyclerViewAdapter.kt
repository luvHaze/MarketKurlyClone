package luv.zoey.layoutsample.fragment.home_fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import luv.zoey.layoutsample.R
import luv.zoey.layoutsample.model.Product

class NewProductRecyclerViewAdapter : RecyclerView.Adapter<NewProductRecyclerViewHolder>() {

    private var itemList = ArrayList<Product>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewProductRecyclerViewHolder {
        return NewProductRecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_new_product, parent, false),
            parent.context
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: NewProductRecyclerViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    fun submitList(list: ArrayList<Product>) {
        itemList = list
    }
}