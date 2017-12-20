package com.vicky7230.kosten.data.db

import android.arch.lifecycle.LiveData
import com.vicky7230.kosten.data.db.room.Expense

/**
 * Created by vicky on 20/12/17.
 */
interface DbHelper {

    fun getExpenses(): LiveData<MutableList<Expense>>

    fun saveExpenses(expenses: MutableList<Expense>): List<Long>
}