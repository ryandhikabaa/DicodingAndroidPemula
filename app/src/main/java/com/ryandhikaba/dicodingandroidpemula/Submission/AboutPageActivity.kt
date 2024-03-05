package com.ryandhikaba.dicodingandroidpemula.Submission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.ryandhikaba.dicodingandroidpemula.R

class AboutPageActivity : AppCompatActivity() {
    private lateinit var btContactMe: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        btContactMe = findViewById(R.id.btContactMe)
        btContactMe.setOnClickListener(View.OnClickListener {
            val phoneNumber = "6285740151761"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$phoneNumber")
            startActivity(intent)
        })

    }
}