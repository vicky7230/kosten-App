package com.vicky7230.kosten.data

import android.arch.lifecycle.LiveData
import com.vicky7230.kosten.data.db.DbHelper
import com.vicky7230.kosten.data.db.room.Expense
import com.vicky7230.kosten.data.network.ApiHelper
import com.vicky7230.kosten.data.network.model.CreateExpenseResponse
import com.vicky7230.kosten.data.prefs.PreferencesHelper
import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject

/**
 * Created by vicky on 21/12/17.
 */
class AppDataManager @Inject
constructor(val apiHelper: ApiHelper, val dbHelper: DbHelper, val preferencesHelper: PreferencesHelper) : DataManager {

    override fun getIsUserLoggedIn(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setIsUserLoggedIn() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLoggedInUserId(): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getExpenses(): LiveData<MutableList<Expense>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setLoggedInUserId(userId: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveExpenses(expenses: MutableList<Expense>): List<Long> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLoggedInUserName(): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setLoggedInUserName(userName: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getExpenses(userId: String, token: String): Observable<MutableList<Expense>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLoggedInUserToken(): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setLoggedInUserToken(token: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createExpense(userId: RequestBody, token: RequestBody, amount: RequestBody, description: RequestBody, photo: MultipartBody.Part): Observable<CreateExpenseResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setUserAsLoggedOut() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}