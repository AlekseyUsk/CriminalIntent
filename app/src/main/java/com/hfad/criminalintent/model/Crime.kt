package com.hfad.criminalintent.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.*

@Entity
data class Crime(
    // Первичный ключ в базе данных который содержит данные,
    //уникальные для каждой записи или строки id: UUID = UUID.randomUUID()
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
) {
}