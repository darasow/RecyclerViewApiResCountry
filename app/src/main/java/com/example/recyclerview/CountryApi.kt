package com.example.recyclerview

import retrofit2.Call
import retrofit2.http.GET

interface CountryApi {
    @GET("all")
    fun getAllCountries(): Call<List<Country>>
}
