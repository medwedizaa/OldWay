package com.example.oldway.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.oldway.R
import com.example.oldway.Track
import com.example.oldway.databinding.ItemTrackBinding
import com.squareup.picasso.Picasso

class MyListAdapter(
//    private val list: List<Track>
) : RecyclerView.Adapter<MyListAdapter.MyViewHolder>() {

    private var myList: List<Track> = listOf()

    fun setList(list: List<Track>) {
        myList = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemTrackBinding//LayoutInflater.from(parent.context)
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return myList.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(myList[position])
    }

    class MyViewHolder(
        private val binding: ItemTrackBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Track) {
            val minutes: Int = item.duration / 60
            val secunds: Int = item.duration % 60
            Picasso.get().load(item.image).into(binding.trackImage)
            binding.trackName.text = item.name
            binding.artistName.text = item.artist
            binding.trackDuration.text = binding.root.resources.getString(
                R.string.track_duration_placeholder,
                minutes,
                secunds
            )
        }
    }
}