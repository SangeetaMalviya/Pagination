package com.example.myapplicationsang

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers


class CatImageViewModel(private val repository: CatImageRepository) : ViewModel() {

    fun getCatImages(limit: Int, page: Int, order: String) = liveData(Dispatchers.IO) {
        try {
            val images = repository.getCatImages(limit, page, order)
            emit(images)
        } catch (e: Exception) {
            emit(emptyList<CatImage>())
        }
    }
}
