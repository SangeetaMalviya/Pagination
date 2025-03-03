package com.example.myapplicationsang
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class CatImageViewModelFactory(private val repository: CatImageRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CatImageViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CatImageViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}


