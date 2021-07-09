package com.example.paggingnews.Network

import com.example.paggingnews.model.NewsModelKotlin
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/v2/top-headlines")
    suspend fun getNewsArticles(@Query("country") country: String, @Query("apiKey") apiKey: String, @Query("page") page: Int) : NewsModelKotlin
}