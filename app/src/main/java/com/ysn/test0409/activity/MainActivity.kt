package com.ysn.test0409.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ysn.test0409.R
import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import android.widget.Button
import com.ysn.test0409.activity.RecyclerViewActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    @SuppressLint("NonConstantResourceId")
    override fun onClick(view: View) {
        when (view.id) {
            R.id.button -> {
                val intent = Intent(this@MainActivity, RecyclerViewActivity::class.java)
                startActivity(intent)
            }
            else -> {}
        }
    }

    private fun init() {
        val mButton = findViewById<Button>(R.id.button)
        mButton.setOnClickListener(this)
    }
}