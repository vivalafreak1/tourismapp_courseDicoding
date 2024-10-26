package com.dicoding.tourismapp

import android.app.Application
import com.dicoding.tourismapp.core.di.DaggerCoreComponent
import com.dicoding.tourismapp.di.AppComponent
import com.dicoding.tourismapp.di.DaggerAppComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class MyApplication : Application() {

}