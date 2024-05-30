package com.alcorp.submission

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alcorp.submission.databinding.ActivityDetailBinding
import com.alcorp.submission.model.Ship
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        supportActionBar?.title = resources.getString(R.string.toolbar_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        showData()
    }

    private fun showData() {
        val ship: Ship = intent.getParcelableExtra(SHIP_EXTRA)!!

        binding.tvShipName.text = ship.shipName
        binding.tvShipDescription.text = ship.shipDesc
        binding.tvShipClass.text = ship.shipClass
        binding.tvShipCountry.text = ship.shipCountry

        Glide.with(this)
            .load(getDrawable(ship.shipPhoto))
            .apply(RequestOptions().override(300, 300))
            .into(binding.ivShip)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        menu.findItem(R.id.about_page).isVisible = false
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        } else {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.setPackage("com.whatsapp")
            intent.putExtra(Intent.EXTRA_TEXT, """
                Ship Name:
                ${binding.tvShipName.text}
                
                Description:
                ${binding.tvShipDescription.text}
                
                Ship class:
                ${binding.tvShipClass.text}
                
                Ship country:
                ${binding.tvShipCountry.text}
            """.trimIndent())
            try {
                startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(this@DetailActivity, resources.getString(R.string.toast_detail), Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val  SHIP_EXTRA = "ship_extra"
    }
}