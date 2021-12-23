package com.example.kotlin_one_day.Kotlin_Basics

import okhttp3.OkHttpClient
import okhttp3.Request

fun main(){
    try {
        val client = OkHttpClient()
        var url: String = "http://reqres.in/api/users?page=2"

        val request = Request.Builder()
            .url(url)
            .build()

        val response = client.newCall(request).execute()
        var result = response.body?.string()
        print(result)
    } catch (err: Error) {
        print("Error When Executing get Requiest:" + err.localizedMessage)
    }
}