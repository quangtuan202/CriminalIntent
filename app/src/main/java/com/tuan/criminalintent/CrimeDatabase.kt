package com.tuan.criminalintent

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Crime::class],version = 1)
@TypeConverters(CrimeTypeConverters::class) //tell your database to use the functions in that class when converting your types.
abstract class CrimeDatabase: RoomDatabase() {
    abstract fun crimeDao():CrimeDao // no implementation of DAO interface here since Room will generate an implementation of this interface and we can use interface function
    //when the database is created, Room will generate a concrete implementation of the DAO that you can access. Once you have a reference to the DAO, you can call any of the functions defined on it to interact with your database.
}