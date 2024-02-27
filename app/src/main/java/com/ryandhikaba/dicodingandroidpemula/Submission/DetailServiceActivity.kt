package com.ryandhikaba.dicodingandroidpemula.Submission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.ryandhikaba.dicodingandroidpemula.R
import com.ryandhikaba.dicodingandroidpemula.Submission.model.ServiceModel

class DetailServiceActivity : AppCompatActivity() {

    private lateinit var ivBack: ImageView
    private lateinit var ivService: ImageView
    private lateinit var tvServicePrice: TextView
    private lateinit var tvServiceName: TextView
    private lateinit var tvServiceDesc: TextView
    private lateinit var tvServiceTime: TextView
    private lateinit var tvServiceBenefit: TextView
    private lateinit var btReservasi: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_service)
        binding()

        // Terima objek Service dari Intent
        val service: ServiceModel? = intent.getParcelableExtra("SERVICE")

        // Periksa apakah objek Service tidak null
        if (service != null) {

            Glide.with(this)
                .load(service.photo) // URL Gambar
                .into(ivService) // imageView mana yang akan diterapkan

            tvServicePrice.text = service.price
            tvServiceName.text = service.name
            tvServiceDesc.text = service.description
            tvServiceTime.text = service.duration
            tvServiceBenefit.text = service.benefits
            btReservasi.setOnClickListener(View.OnClickListener {
                val phoneNumber = "6285740151761"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://wa.me/$phoneNumber")
                startActivity(intent)
            })
        } else {
            Toast.makeText(this, "Opps!, Data Service Tidak Ditemukan", Toast.LENGTH_SHORT).show()

            finish()
        }
    }

    fun binding(){
        ivBack = findViewById(R.id.ivBack)
        ivBack.setOnClickListener(View.OnClickListener {
            finish()
        })
        ivService = findViewById(R.id.ivService)
        tvServicePrice = findViewById(R.id.tvServicePrice)
        tvServiceName = findViewById(R.id.tvServiceName)
        tvServiceDesc = findViewById(R.id.tvServiceDesc)
        tvServiceTime = findViewById(R.id.tvServiceTime)
        tvServiceBenefit = findViewById(R.id.tvServiceBenefit)
        btReservasi = findViewById(R.id.btReservasi)
    }
}