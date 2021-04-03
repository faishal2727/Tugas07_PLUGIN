package com.example.iribilangboossss

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            startActivity(Intent(this,kontak::class.java))
        }
        login.setOnClickListener {
            startActivity(Intent(this,parsing::class.java))
        }
        merah.setOnClickListener {
            val youtube = Intent(Intent.ACTION_VIEW)
            youtube.setData(Uri.parse("https://www.youtube.com/"))
            startActivity(youtube)
        }
        btnExit.setOnClickListener {
            finish()


        }
    }
}