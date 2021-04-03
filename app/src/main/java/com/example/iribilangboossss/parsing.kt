package com.example.iribilangboossss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_parsing.*

class parsing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parsing)
        button1.setOnClickListener {
            if (edit1.text.trim().isNotEmpty() && edit2.text.trim().isNotEmpty()) {
                Toast.makeText(this, "Log in Sukses", Toast.LENGTH_SHORT).show()

                val pertama = edit1.text.toString()
                val kedua = edit2.text.toString()
                Intent(Intent(this, hasilparsing::class.java)).also {
                    it.putExtra("satu", pertama)
                    it.putExtra("dua", kedua)
                    startActivity(it)
                }
            }else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }

        }
        backk.setOnClickListener {
            finish()
        }

    }
}