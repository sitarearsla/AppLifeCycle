package com.sitare.lifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("onCreate", "working")
        welcomeTextView.text = "Welcome!"

        buttonPageX.setOnClickListener {
            val intent = Intent(this@MainActivity, PageXActivity::class.java)
            startActivity(intent)
        }

        buttonPageA.setOnClickListener {
            val intent = Intent(this@MainActivity, PageAActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart", "working")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "working")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause", "working")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "working")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "working")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart", "working")
    }
}