package com.vicky7230.kosten.data.network

import com.vicky7230.kosten.data.db.room.Expense
import com.vicky7230.kosten.data.network.model.CreateExpenseResponse
import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

/**
 * Created by vicky on 19/12/17.
 */
interface ApiService {

    @FormUrlEncoded
    @POST("")
    fun getExpenses(
            @Field("userId") userId: String,
            @Field("token") token: String
    ): Observable<MutableList<Expense>>

    @Multipart
    @POST("")
    fun createExpense(
            @Part("userId") userId: RequestBody,
            @Part("token") token: RequestBody,
            @Part("amount") amount: RequestBody,
            @Part("description") description: RequestBody,
            @Part photo: MultipartBody.Part
    ): Observable<CreateExpenseResponse>
}