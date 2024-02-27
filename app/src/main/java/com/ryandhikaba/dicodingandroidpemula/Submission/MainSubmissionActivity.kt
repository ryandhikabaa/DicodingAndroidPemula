package com.ryandhikaba.dicodingandroidpemula.Submission

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ryandhikaba.dicodingandroidpemula.R
import com.ryandhikaba.dicodingandroidpemula.RecyclerViewModul.Hero
import com.ryandhikaba.dicodingandroidpemula.RecyclerViewModul.ListHeroAdapter
import com.ryandhikaba.dicodingandroidpemula.Submission.adapter.ServiceAdapter
import com.ryandhikaba.dicodingandroidpemula.Submission.model.ServiceModel
import com.ryandhikaba.dicodingandroidpemula.Submission.model.carDetailingServices
import kotlinx.coroutines.newSingleThreadContext

class MainSubmissionActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var rvService: RecyclerView
    private val list = ArrayList<ServiceModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_submission)

        rvService = findViewById(R.id.rvService)
        rvService.setHasFixedSize(true)

        binding()

        list.addAll(getListService())
        showRecyclerList()

    }

    private fun showSelectedService(serviceModel: ServiceModel) {

        val intent = Intent(this, DetailServiceActivity::class.java)
        intent.putExtra("SERVICE", serviceModel)
        startActivity(intent)
    }

    private fun getListService(): ArrayList<ServiceModel> {
        val listService = ArrayList<ServiceModel>()
        listService.addAll(carDetailingServices)
        return listService
    }

    private fun showRecyclerList() {
        rvService.layoutManager = LinearLayoutManager(this)
        val listServiceAdapter = ServiceAdapter(list)
        rvService.adapter = listServiceAdapter

        listServiceAdapter.setOnItemClickCallback(object : ServiceAdapter.OnItemClickCallback {
            override fun onItemClicked(data: ServiceModel) {
                showSelectedService(data)
            }
        })
    }

    fun binding() {
        toolbar = findViewById(R.id.toolbar)
        // using toolbar as ActionBar
        setSupportActionBar(toolbar)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_to_profile_main, menu)
        // Ubah warna ikon pada menu toolbar
        val item = menu?.findItem(R.id.about_page)
        val icon = item?.icon
        icon?.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_IN)
        item?.icon = icon
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_page -> {
                val intent = Intent(this, AboutPageActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}