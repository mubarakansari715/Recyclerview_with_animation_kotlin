package com.mubarakansari.recyclerview_with_animation_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mAdapter: AdapterClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItem: MutableList<DataModel> = mutableListOf()
        for (item in 0..15) {
            listItem += DataModel("Mubarak Ansari", "Happy")
        }

        mAdapter = AdapterClass(ArrayList())
        recyclerView.adapter = AdapterClass(listItem)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        materialButton.setOnClickListener {
            recyclerView.startLayoutAnimation()
        }
    }
}