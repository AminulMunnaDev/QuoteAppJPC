package com.example.quotesappjpc.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesappjpc.Model.Quote

@Composable
fun QuoteListScreen(
    data: Array<Quote>, onclick: () -> Unit
) {
    Column {
        Text(text = "Quote App",
            fontSize = 45.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp,24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.bodyLarge
            )
        QuoteList(data = data){
            onclick()
        }
    }
}