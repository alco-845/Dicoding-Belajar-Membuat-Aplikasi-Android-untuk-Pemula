package com.alcorp.submission.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alcorp.submission.DetailActivity
import com.alcorp.submission.DetailActivity.Companion.SHIP_EXTRA
import com.alcorp.submission.databinding.ItemListBinding
import com.alcorp.submission.model.Ship
import com.bumptech.glide.Glide

class ShipAdapter(private val listData: ArrayList<Ship>) : RecyclerView.Adapter<ShipAdapter.ShipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShipViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShipViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShipViewHolder, position: Int) {
        with(holder) {
            with(listData[position]) {
                val context = binding.root.context
                binding.itemTitle.text = shipName
                binding.itemDesc.text = shipDesc

                Glide.with(context)
                    .load(context.getDrawable(shipPhoto))
                    .into(binding.itemImg)

                binding.root.setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra(SHIP_EXTRA, listData[position])
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = listData.size

    inner class ShipViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)
}