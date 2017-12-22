package com.vicky7230.kosten.data.db.room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by vicky on 20/12/17.
 */

@Entity(tableName = "expenses")
data class Expense(
        @SerializedName("id")
        @Expose
        @PrimaryKey
        @ColumnInfo(name = "id")
        var id: Int = 0,

        @SerializedName("amount")
        @Expose
        @ColumnInfo(name = "amount")
        var amount: String = "",

        @SerializedName("description")
        @Expose
        @ColumnInfo(name = "description")
        var description: String = "",

        @SerializedName("photo")
        @Expose
        @ColumnInfo(name = "photo")
        var photo: String = "",

        @SerializedName("createdAt")
        @Expose
        @ColumnInfo(name = "createdAt")
        var createdAt: String = "",

        @SerializedName("approved")
        @Expose
        @ColumnInfo(name = "approved")
        var approved: Boolean = false
)
