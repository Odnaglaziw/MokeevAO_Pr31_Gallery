package com.amok.gallery

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=35f409f64328dab8f31564a7c9fcdfda&format=json&nojsoncallback=1&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>
}