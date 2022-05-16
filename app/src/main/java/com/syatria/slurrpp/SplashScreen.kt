package com.syatria.slurrpp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.syatria.slurrpp.loginregist.LoginActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        supportActionBar?.hide()

        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
//        add a delay for splashscreen
        Thread(Runnable {
            try {
                Thread.sleep(3000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            runOnUiThread {
                startActivity(intent)
                finish()
            }
        }).start()
    }
}