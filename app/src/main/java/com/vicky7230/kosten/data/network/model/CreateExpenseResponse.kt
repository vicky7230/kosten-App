package com.vicky7230.kosten.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by vicky on 20/12/17.
 */
data class CreateExpenseResponse(
        @SerializedName("succes")
        @Expose
        val success: Boolean,
        @SerializedName("status")
        @Expose
        val status: Boolean,
        @SerializedName("message")
        @Expose
        val message: String
)
