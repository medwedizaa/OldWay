package com.example.oldway.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.oldway.R
import com.example.oldway.Track

class MyListAdapter(
//    private val list: List<Track>
) : RecyclerView.Adapter<MyListAdapter.MyViewHolder>() {

    private var myList: List<Track> = listOf()

    fun setList(list: List<Track>) {
        myList = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_track, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return myList.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = myList[position].name
    }

    class MyViewHolder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.track_name)
        }
    }
}