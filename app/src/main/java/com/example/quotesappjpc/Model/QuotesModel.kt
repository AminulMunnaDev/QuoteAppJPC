package com.example.quotesappjpc.Model

import android.icu.text.CaseMap.Title
import androidx.compose.ui.graphics.vector.ImageVector

data class QuotesModel(
    val image: ImageVector,
    val quote:String,
    val poetName:String
)
