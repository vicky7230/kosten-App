package com.vicky7230.kosten.data.network

import com.vicky7230.kosten.data.db.room.Expense
import com.vicky7230.kosten.data.network.model.CreateExpenseResponse
import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.RequestBody

/**
 * Created by vicky on 20/12/17.
 */
interface ApiHelper {

    fun getExpenses(userId: String, token: String): Observable<MutableList<Expense>>

    fun createExpense(
            userId: RequestBody,
            token: RequestBody,
            amount: RequestBody,
            description: RequestBody,
            photo: MultipartBody.Part
    ): Observable<CreateExpenseResponse>
}