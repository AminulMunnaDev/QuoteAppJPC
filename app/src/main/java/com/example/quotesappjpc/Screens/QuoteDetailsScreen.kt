package com.example.quotesappjpc.Screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesappjpc.DataManager
import com.example.quotesappjpc.Model.Quote


@Composable
fun QuoteDetails(quote: Quote) {

    BackHandler {
        DataManager.switchPages(null)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFF858181),
                        Color(0xFFffffff),
                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.cardElevation(6.dp),
            modifier = Modifier.padding(32.dp)
        ) {
            Box( // Use Box to get BoxScope and align the Column
                contentAlignment = Alignment.Center
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(16.dp, 24.dp)
                ) {
                    Image(
                        Icons.Filled.FormatQuote,
                        contentDescription = "Quote",
                        modifier = Modifier
                            .size(80.dp)
                            .rotate(180f)
                    )
                    Text(
                        text = quote.text,
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.padding(16.dp))
                    Text(text = quote.author,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Italic,
                        style = MaterialTheme.typography.bodyLarge)

                }
            }
        }
    }
}