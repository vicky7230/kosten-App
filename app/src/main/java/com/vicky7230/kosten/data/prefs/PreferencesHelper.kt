package com.vicky7230.kosten.data.prefs

/**
 * Created by vicky on 21/12/17.
 */
interface PreferencesHelper {

    fun getIsUserLoggedIn(): Boolean

    fun setIsUserLoggedIn()

    fun getLoggedInUserId(): String?

    fun setLoggedInUserId(userId: String?)

    fun getLoggedInUserName(): String?

    fun setLoggedInUserName(userName: String?)

    fun getLoggedInUserToken(): String?

    fun setLoggedInUserToken(token: String?)

    fun setUserAsLoggedOut()
}