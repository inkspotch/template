package com.example.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}


/*

Nasa url: https://api.nasa.gov/ >> Browse APIs >> Mars Rover Photos.
3S1iaGkPPMBMWCIAkuAwEO926ptawY2U9UE3nwDg

Retrofit api notes
val retrofit = Retrofit.Builder()
            .baseUrl("https://api.nasa.gov/mars-photos/api/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .build()

val service = retrofit.createService(<Class>)
 */
