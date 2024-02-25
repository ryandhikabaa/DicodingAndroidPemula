package com.ryandhikaba.dicodingandroidpemula.IntentModul

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.ryandhikaba.dicodingandroidpemula.R
import com.ryandhikaba.dicodingandroidpemula.kalkulator.KalkulatorActivity

class MainIntentActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView

    private val resultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == MoveForResultActivity.RESULT_CODE && result.data != null) {
            val selectedValue =
                result.data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)
            tvResult.text = "Hasil : $selectedValue"
        }
    }

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_intent)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(View.OnClickListener {
            val moveIntent = Intent(this@MainIntentActivity, SeconfIntentActivity::class.java)
            startActivity(moveIntent)
        })
        val btnMoveActivityWithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityWithData.setOnClickListener(View.OnClickListener {
            val moveWithDataIntent = Intent(this@MainIntentActivity, SeconfIntentActivity::class.java)
            moveWithDataIntent.putExtra(SeconfIntentActivity.EXTRA_NAME, "DicodingAcademy Ryandhika")
            moveWithDataIntent.putExtra(SeconfIntentActivity.EXTRA_AGE, 20)
            startActivity(moveWithDataIntent)
        })
        val btnMoveWithObject: Button = findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(View.OnClickListener {
            val person = Person(
                "DicodingAcademy",
                5,
                "academy@dicoding.com",
                "Bandung"
            )
            val moveWithObjectIntent = Intent(this@MainIntentActivity, SeconfIntentActivity::class.java)
            moveWithObjectIntent.putExtra(SeconfIntentActivity.EXTRA_PERSON, person)
            startActivity(moveWithObjectIntent)
        })

        val btnMoveInplisit: Button = findViewById(R.id.btn_dial_number)
        btnMoveInplisit.setOnClickListener(View.OnClickListener {
            val phoneNumber = "081210841382"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        })

        val btnMoveForResult: Button = findViewById(R.id.btn_move_for_result)
        btnMoveForResult.setOnClickListener(View.OnClickListener {
            val moveForResultIntent = Intent(this@MainIntentActivity, MoveForResultActivity::class.java)
            resultLauncher.launch(moveForResultIntent)
        })
        tvResult = findViewById(R.id.tv_result)

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(MainIntentActivity.STATE_RESULT)
            tvResult.text = result
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(MainIntentActivity.STATE_RESULT, tvResult.text.toString())
    }
}