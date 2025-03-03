package com.example.myapplicationsang

import com.example.myapplicationsang.RetrofitInstance.apiService

class CatImageRepository(apiService: ApiService) {

    suspend fun getCatImages(limit: Int, page: Int, order: String): List<CatImage> {
        return apiService.getCatImages(limit, page, order)
    }

}

