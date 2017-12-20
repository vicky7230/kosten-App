package com.vicky7230.kosten.data.db.room

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

/**
 * Created by vicky on 20/12/17.
 */
@Dao
interface ExpenseDao {
    @Query("SELECT * FROM user")
    fun selectExpenses(): LiveData<MutableList<Expense>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertExpenses(expenses: MutableList<Expense>): List<Long>

}