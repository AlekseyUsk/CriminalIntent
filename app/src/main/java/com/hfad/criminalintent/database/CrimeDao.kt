package com.hfad.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.hfad.criminalintent.model.Crime
import java.util.*

// создание обьекта доступа к базе данных

@Dao
interface CrimeDao {

    @Query("SELECT * FROM crime")  //выводит все столбцы для всех строк таблицы crime
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)") //запрашивает все столбцы только из строки с нужным id
    fun getCrime(id: UUID): LiveData<Crime?>
}