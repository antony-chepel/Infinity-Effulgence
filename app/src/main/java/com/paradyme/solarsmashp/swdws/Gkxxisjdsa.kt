package com.paradyme.solarsmashp.swdws

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Gkxxisjdsa {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun fpvlcv(): Response<Zoxixcjxchu>

    @GET("const.json")
    suspend fun sijd(): Response<Dksidjsji>






}

@Keep
data class Zoxixcjxchu(
    @SerializedName("city")
    val fokdokdof: String,
    @SerializedName("country")
    val xkzxczoxczo: String,
    @SerializedName("countryCode")
    val sidjsdji: String,
)

@Keep
data class Dksidjsji(
    @SerializedName("geo")
    val fokcxkoc: String,
    @SerializedName("view")
    val eooksdkos: String,
    @SerializedName("appsChecker")
    val dopssdp: String,
)
