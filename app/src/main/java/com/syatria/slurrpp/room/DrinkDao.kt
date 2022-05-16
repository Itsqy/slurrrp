package com.syatria.slurrpp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface DrinkDao {

    @Insert
    suspend fun addDrink(drink: Drink)

    @Query("SELECT * FROM Drink order by id desc")
    suspend fun getDrinks(): List<Drink>
}