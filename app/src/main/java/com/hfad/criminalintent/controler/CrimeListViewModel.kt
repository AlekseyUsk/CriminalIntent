package com.hfad.criminalintent.controler

import androidx.lifecycle.ViewModel
import com.hfad.criminalintent.model.Crime
import java.text.SimpleDateFormat
import java.util.*

class CrimeListViewModel : ViewModel() {

    var currentDate: String =
        SimpleDateFormat("dd/MM/yyyy/\"HH:mm:ss\"", Locale.getDefault()).format(Date())

    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
}