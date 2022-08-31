package com.hfad.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.hfad.criminalintent.model.Crime

// КЛАСС БАЗЫ ДАННЫХ
@Database(
    entities = [Crime::class],
    version = 1
)

@TypeConverters(CrimeTypeConverters::class) // подкл конвертр к базе данных


abstract class CrimeDatabase : RoomDatabase() {

    abstract fun crimeDao(): CrimeDao
}