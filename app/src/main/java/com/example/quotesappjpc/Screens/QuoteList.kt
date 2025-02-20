package com.example.quotesappjpc.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotesappjpc.Model.Quote

@Composable
fun QuoteList(
    data: Array<Quote>,
    onClick: (quote: Quote) -> Unit
) {
    LazyColumn(
        content = {
            items(data) {
                QuotesListItem(quote = it, { onClick(it) })
            }
        }
    )
}
