package com.example.newsaapp.repository

import androidx.room.Query
import com.example.newsaapp.api.Retrofitinstance
import com.example.newsaapp.db.ArticleDatabase
import com.example.newsaapp.models.Article

class NewsRepository(val db: ArticleDatabase) {

    suspend fun  getHeadlines(countryCode: String, pageNumber: Int) =
        Retrofitinstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        Retrofitinstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getFavouriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}