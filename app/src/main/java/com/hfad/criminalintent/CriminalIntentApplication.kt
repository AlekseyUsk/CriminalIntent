package com.hfad.criminalintent

import android.app.Application
import com.hfad.criminalintent.repository.CrimeRepository

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}