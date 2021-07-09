package com.example.paggingnews.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.paggingnews.model.NewsModelKotlin

class NewsPagingSource: PagingSource<Int, NewsModelKotlin>() {
    
    override fun getRefreshKey(state: PagingState<Int, NewsModelKotlin>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, NewsModelKotlin> {
        TODO("Not yet implemented")
    }

}