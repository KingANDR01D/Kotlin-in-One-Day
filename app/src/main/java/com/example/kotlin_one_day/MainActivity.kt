package com.example.kotlin_one_day

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
}