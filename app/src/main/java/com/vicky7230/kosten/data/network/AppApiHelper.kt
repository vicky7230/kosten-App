package com.vicky7230.kosten.data.network

import com.vicky7230.kosten.data.db.room.Expense
import com.vicky7230.kosten.data.network.model.CreateExpenseResponse
import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject

/**
 * Created by vicky on 20/12/17.
 */
class AppApiHelper @Inject constructor(val apiService: ApiService) : ApiHelper {
    override fun getExpenses(userId: String, token: String): Observable<MutableList<Expense>> {
        return apiService.getExpenses(userId, token)
    }

    override fun createExpense(userId: RequestBody, token: RequestBody, amount: RequestBody, description: RequestBody, photo: MultipartBody.Part): Observable<CreateExpenseResponse> {
        return apiService.createExpense(userId, token, amount, description, photo)
    }

}