package luv.zoey.layoutsample.model

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class Product(
    var title: String?,
    var price: String?,
    var image: String?
) : Serializable {
}