package luv.zoey.layoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.lang.Exception

class SplashActivity : AppCompatActivity() {

    private var runnable: Runnable? = null
    private var handle: Handler? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        runnable = Runnable {
            startActivity(Intent(this, MainActivity::class.java))
        }

        handle = Handler()
        handle?. run {
            postDelayed(runnable!!, 2000)
        }


    }

}