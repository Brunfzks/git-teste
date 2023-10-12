package com.example.nav_test.view.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.nav_test.constants.Constants
import com.example.nav_test.models.DogModel
import com.example.nav_test.network.DogRepositoriesRepository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DogRepositoriesViewModel():ViewModel() {
    private val repository = DogRepositoriesRepository()

    fun getDog(
    ): Observable<DogModel> {
            return repository.getDog()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).doOnError{
                    Log.e(Constants.REPOSITORIES_VIEW_MODEL, it.message.toString())
                }.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())

    }
}