package com.example.myapplicationsang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var catImageAdapter: CatImageAdapter
    private lateinit var catImageViewModel: CatImageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Create Repository instance
        val repository = CatImageRepository(RetrofitInstance.apiService)

        // Step 2: Pass Repository to ViewModelFactory
        val factory = CatImageViewModelFactory(repository)

        // Step 3: Use ViewModelProvider with Factory
        catImageViewModel = ViewModelProvider(this, factory)[CatImageViewModel::class.java]

        // Step 4: Setup RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        catImageAdapter = CatImageAdapter(mutableListOf())

        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = catImageAdapter

        // Step 5: Fetch and Observe Data
        loadCatImages()
    }

    private fun loadCatImages() {
        catImageViewModel.getCatImages(10, 1, "Desc").observe(this) { images ->
            catImageAdapter.addImages(images)
        }
    }
}





