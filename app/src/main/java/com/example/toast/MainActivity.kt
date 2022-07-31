package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.toast.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("spar", Context.MODE_PRIVATE)

        val editor = sp.edit()

        var num = sp.getInt("test", 0)

        if (num % 3 == 0) {
            Toast.makeText(this, num.toString(), Toast.LENGTH_SHORT).show()
            editor.putInt("test", ++num)
            editor.apply()
        } else {
            editor.putInt("test", ++num)
            editor.apply()
        }

    }
}