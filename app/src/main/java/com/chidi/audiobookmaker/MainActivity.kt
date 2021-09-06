package com.chidi.audiobookmaker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chaquo.python.Python

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun getPyFunHello(): String {
        val python = Python.getInstance()
        val pyFile = python.getModule("helloworldscript")
        return pyFile.callAttr("helloworld").toString()
    }
}