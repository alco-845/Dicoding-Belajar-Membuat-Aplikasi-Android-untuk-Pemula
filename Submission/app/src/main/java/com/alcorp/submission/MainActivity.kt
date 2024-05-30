package com.alcorp.submission

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alcorp.submission.adapter.ShipAdapter
import com.alcorp.submission.databinding.ActivityMainBinding
import com.alcorp.submission.model.Ship
import com.alcorp.submission.util.ShipData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val listData = ArrayList<Ship>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        supportActionBar?.title = resources.getString(R.string.toolbar_main_menu)

        listData.addAll(ShipData.getListData)
        showRecycler()
    }

    private fun showRecycler() {
        val adapter = ShipAdapter(listData)
        binding.rvShip.adapter = adapter
        binding.rvShip.layoutManager = LinearLayoutManager(this)
        binding.rvShip.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        menu.findItem(R.id.action_share).isVisible = false
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_page) {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}