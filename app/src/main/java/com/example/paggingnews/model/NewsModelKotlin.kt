package com.example.paggingnews.model

data class NewsModelKotlin(
    val articles: ArrayList<Article>,
    val status: String,
    val totalResults: Int
)