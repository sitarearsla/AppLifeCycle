package com.sitare.lifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_b.*

class PageBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_b)

        PageBButton.setOnClickListener {
            val intent = Intent(this@PageBActivity, PageYActivity::class.java)
            startActivity(intent)
        }
    }
}