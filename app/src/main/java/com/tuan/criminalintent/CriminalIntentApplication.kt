package com.tuan.criminalintent

import android.app.Application

class CriminalIntentApplication: Application() {
    override fun onCreate(){
        super.onCreate()
        CrimeRepository.initialize(this)
    }

}