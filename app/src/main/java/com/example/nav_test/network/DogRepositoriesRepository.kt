package com.example.nav_test.network

import com.example.nav_test.constants.Constants
import com.example.nav_test.models.DogModel
import com.example.nav_test.network.interfaces.DogInterfaceAPI
import io.reactivex.Observable

class DogRepositoriesRepository {
    fun getDog(

    ): Observable<DogModel> {
        val retrofitClient = NetworkUtils.getRetrofitInstance(Constants.HOST)
        val gitHubRepositoriesAPI = retrofitClient.create(DogInterfaceAPI::class.java)

        return gitHubRepositoriesAPI.getDog()
    }
}