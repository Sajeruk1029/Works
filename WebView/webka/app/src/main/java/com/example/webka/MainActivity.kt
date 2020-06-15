package com.example.webka

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webelement.webViewClient = Move()

        webelement.settings.javaScriptEnabled = true;

    }




    fun OnCickGo(view : View)
    {


        webelement.loadUrl(adress.text.toString())

        Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

    }

}
