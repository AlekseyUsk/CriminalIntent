package com.hfad.criminalintent.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.hfad.criminalintent.database.CrimeDatabase
import com.hfad.criminalintent.model.Crime
import java.util.*


private const val DATABASE_NAME = "crime_database"

class CrimeRepository private constructor(context: Context) {

    private val database: CrimeDatabase =
        Room.databaseBuilder(
            context.applicationContext,
            CrimeDatabase::class.java,
            DATABASE_NAME
        ).build()
    private val crimeDao = database.crimeDao()

    companion object {
        private var INSTANCE: CrimeRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = CrimeRepository(context)
            }
        }

        fun get(): CrimeRepository {
            return INSTANCE ?: throw IllegalStateException("CrimeRepository must beinitialized")
        }
    }

    fun getCrimes(): LiveData<List<Crime>> = crimeDao.getCrimes()

    fun getCrime(id: UUID): LiveData<Crime?> =
        crimeDao.getCrime(id)


}