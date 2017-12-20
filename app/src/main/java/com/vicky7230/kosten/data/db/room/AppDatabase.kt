package com.vicky7230.kosten.data.db.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


/**
 * Created by vicky on 20/12/17.
 */
@Database(entities = arrayOf(Expense::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun expenseDao(): ExpenseDao
}