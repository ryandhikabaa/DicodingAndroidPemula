package com.ryandhikaba.dicodingandroidpemula.IntentModul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ryandhikaba.dicodingandroidpemula.R

class SeconfIntentActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"

        const val EXTRA_PERSON = "extra_person"
    }

    lateinit var tvDataReceived: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconf_intent)

        tvDataReceived = findViewById(R.id.tv_data_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "Name : $name, Your Age : $age"
        tvDataReceived.text = text

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON)
        if (person != null) {
            val text = "Name : ${person.name.toString()},\nEmail : ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
            tvDataReceived.text = text
        }
    }
}