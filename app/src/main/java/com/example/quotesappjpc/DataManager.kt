package com.example.quotesappjpc

import android.content.Context
import com.example.quotesappjpc.Model.Quote
import com.google.gson.Gson

object DataManager {
    var data = emptyArray<Quote>()
    fun loadAssetFromFiles(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer =ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json,Array<Quote>::class.java)


    }
}