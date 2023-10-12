package com.example.nav_test

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.nav_test.R
import com.example.nav_test.databinding.ActivityMainBinding
import com.example.nav_test.models.DogModel
import com.example.nav_test.view.viewmodel.DogRepositoriesViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.reactivex.disposables.CompositeDisposable

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    private val viewModel = DogRepositoriesViewModel()
    private val mCompositeDisposable = CompositeDisposable()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        getDog()
    }
    private fun getDog() {
        mCompositeDisposable.clear()


        mCompositeDisposable.add(
            viewModel.getDog()
                .subscribe({
                    Toast.makeText(
                        this,
                        it.url,
                        Toast.LENGTH_LONG
                    ).show()
                }, {
                    Toast.makeText(
                        this,
                        "teste2",
                        Toast.LENGTH_LONG
                    ).show()
                })
        )
    }



}