package com.chidi.audiobookmaker

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chaquo.python.Python

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.helloPy).text = getPyFunHello()
    }

    private fun getPyFunHello(): String {
        val python = Python.getInstance()
        val pyFile = python.getModule("helloworldscript")
        return pyFile.callAttr("helloworld").toString()
    }
}