package com.example.myapplicationsang

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("images/search")
    suspend fun getCatImages(
        @Query("limit") limit: Int,
        @Query("page") page: Int,
        @Query("order") order: String
    ): List<CatImage>
}
