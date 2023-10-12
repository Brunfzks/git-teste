package com.example.nav_test.network.interfaces

import com.example.nav_test.constants.Constants
import com.example.nav_test.models.DogModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface DogInterfaceAPI {
    @GET(Constants.SEARCH_ENDPOINT)
    fun getDog(

    ): Observable<DogModel>
}