package com.example.newsaapp.models

import com.example.newsaapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)