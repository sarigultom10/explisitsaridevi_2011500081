package com.example.explisitsaridevi_2011500081

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNIm = findViewById<EditText>(R.id.etNim)
        val etNama = findViewById<EditText>(R.id.etNama)
        val btnProcess = findViewById<Button>(R.id.btnProses)

        btnProcess.setOnClickListener {
            if("${etNIm.text}".isNotEmpty()&& "${etNama.text}".isNotEmpty()) {
                val i = Intent(this@MainActivity, TampilDataActivity::class.java)
                i.putExtra("NIM", "${etNIm.text}")
                i.putExtra("Nama", "${etNama.text}")
                startActivity(i)
            }   else
                Toast.makeText(this@MainActivity, "NIM atau nama belum diisi", Toast.LENGTH_SHORT).show()
        }
    }
}