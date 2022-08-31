package com.hfad.criminalintent.database

import androidx.room.TypeConverter
import java.util.*
import java.util.Date

// КЛАСС КОНВЕРТЕР

class CrimeTypeConverters {

    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch: Long?): Date {
        if (millisSinceEpoch != null) {
        }
        return Date()
    }

    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }

    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }


}