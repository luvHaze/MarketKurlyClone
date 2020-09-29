package luv.zoey.layoutsample.fragment.home_fragment.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_new_product.*
import luv.zoey.layoutsample.BillActivity
import luv.zoey.layoutsample.R
import luv.zoey.layoutsample.model.Product

class NewProductRecyclerViewHolder (itemView: View, var context: Context): RecyclerView.ViewHolder(itemView) {

    private val title = itemView.findViewById<TextView>(R.id.item_new_product_title)
    private val price = itemView.findViewById<TextView>(R.id.item_new_product_price)
    private var image = itemView.findViewById<ImageView>(R.id.item_new_product_image)

    private lateinit var  product: Product
    init {
        image.setOnClickListener {

            var intent = Intent(it.context, BillActivity::class.java)
            intent.putExtra("productInfo", product)
            it.context.startActivity(intent)
            Log.d("TAG", "item Image Clicked")
        }

    }

    fun bind(product: Product) {
        this.product = product
        title.text = this.product.title
        price.text = this.product.price
        Glide.with(itemView).load(this.product.image).into(image)
    }

}