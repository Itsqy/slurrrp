package com.syatria.slurrpp.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Drink(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    var image: Int,
    var ingredient: String,
    var step: Int,
)
