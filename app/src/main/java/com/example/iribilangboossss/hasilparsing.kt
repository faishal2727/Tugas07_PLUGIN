package com.example.iribilangboossss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasilparsing.*

class hasilparsing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasilparsing)
        val nama1 = intent.getStringExtra("satu")
        val nama2 = intent.getStringExtra("dua")
        val full = "$nama1 $nama2"
        hasilnya.text = "SELAMAT DATANG $full, SEMOGA HARIMU MENYENANGKAN"



        button3.setOnClickListener {
            finish()
        }
    }
}