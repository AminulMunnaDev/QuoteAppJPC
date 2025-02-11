package com.example.quotesappjpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.quotesappjpc.Screens.QuotesListItem
import com.example.quotesappjpc.ui.theme.QuotesAppJPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuotesAppJPCTheme {
                QuotesListItem()
            }
        }
    }
}

