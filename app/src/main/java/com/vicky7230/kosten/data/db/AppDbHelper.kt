package com.vicky7230.kosten.data.db

import android.arch.lifecycle.LiveData
import com.vicky7230.kosten.data.db.room.AppDatabase
import com.vicky7230.kosten.data.db.room.Expense
import javax.inject.Inject

/**
 * Created by vicky on 20/12/17.
 */
class AppDbHelper @Inject
constructor(val appDatabase: AppDatabase) : DbHelper {
    override fun getExpenses(): LiveData<MutableList<Expense>> {
        return appDatabase.expenseDao().selectExpenses()
    }

    override fun saveExpenses(expenses: MutableList<Expense>): List<Long> {
        return appDatabase.expenseDao().insertExpenses(expenses)
    }

}