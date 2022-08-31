package com.hfad.criminalintent.controler

import androidx.lifecycle.ViewModel
import com.hfad.criminalintent.model.Crime
import com.hfad.criminalintent.repository.CrimeRepository
import java.text.SimpleDateFormat
import java.util.*

class CrimeListViewModel : ViewModel() {

//    var currentDate: String =
//        SimpleDateFormat("dd/MM/yyyy/\"HH:mm:ss\"", Locale.getDefault()).format(Date())


    private val crimeRepository =
        CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

}
