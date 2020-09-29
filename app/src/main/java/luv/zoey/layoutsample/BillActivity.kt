package luv.zoey.layoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import luv.zoey.layoutsample.model.Product

class BillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)

        var product = intent.getSerializableExtra("productInfo") as Product

        Log.d("TAG", "Price : ${product.price}")
        Log.d("TAG", "Title : ${product.title}")
        Log.d("TAG", "Image : ${product.image}")

    }
}