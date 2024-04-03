package com.example.oldway

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.oldway.adapters.MyListAdapter
import com.example.oldway.databinding.FragmentMainBinding


class MainFragment: Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root ?: super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trackList = listOf<Track>(
            Track(name = "name1", duration = 354, artist = "artist1"),
            Track(name = "name2", duration = 354, artist = "artist2"),
            Track(name = "name3", duration = 354, artist = "artist3")
        )

        val myAdapter: MyListAdapter = MyListAdapter()
        binding?.myList?.adapter = myAdapter
        myAdapter.setList(trackList)

    }

}

data class Track(
    val name: String,
    val duration: Int,
    val artist: String
)