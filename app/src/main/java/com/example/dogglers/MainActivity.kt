package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.dogglers.adapter.itemAdapter
import com.example.dogglers.data_source.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDataset = DataSource().loadDogglers()
        val recyclerView = findViewById<RecyclerView>(R.id.recylcer_view)
        recyclerView.adapter = itemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}