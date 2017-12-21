package com.vicky7230.kosten.data.prefs

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.vicky7230.kosten.data.Config
import com.vicky7230.kosten.di.ApplicationContext
import javax.inject.Inject


/**
 * Created by vicky on 21/12/17.
 */
class AppPreferencesHelper @Inject constructor(@ApplicationContext private val context: Context) : PreferencesHelper {

    //for session handling
    private val IS_USER_LOGGED_IN = "IS_USER_LOGGED_IN"
    private val LOGGED_IN_USER_ID = "USER_ID"
    private val LOGGED_IN_USER_NAME = "USER_NAME"
    private val LOGGED_IN_USER_TOKEN = "USER_TOKEN"

    var sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)


    override fun getIsUserLoggedIn(): Boolean {
        return sharedPreferences.getBoolean(IS_USER_LOGGED_IN, false)
    }

    override fun setIsUserLoggedIn() {
        sharedPreferences.edit().putBoolean(IS_USER_LOGGED_IN, true).apply()
    }

    override fun getLoggedInUserId(): String? {
        val userId = sharedPreferences.getString(LOGGED_IN_USER_ID, Config.NULL_TYPE)
        return if (userId.equals(Config.NULL_TYPE, ignoreCase = true)) null else userId
    }

    override fun setLoggedInUserId(userId: String?) {
        val id = userId ?: Config.NULL_TYPE
        sharedPreferences.edit().putString(LOGGED_IN_USER_ID, id).apply()
    }

    override fun getLoggedInUserName(): String? {
        val userName = sharedPreferences.getString(LOGGED_IN_USER_NAME, Config.NULL_TYPE)
        return if (userName.equals(Config.NULL_TYPE, ignoreCase = true)) null else userName
    }

    override fun setLoggedInUserName(userName: String?) {
        val name = userName ?: Config.NULL_TYPE
        sharedPreferences.edit().putString(LOGGED_IN_USER_NAME, name).apply()
    }

    override fun getLoggedInUserToken(): String? {
        val token = sharedPreferences.getString(LOGGED_IN_USER_TOKEN, Config.NULL_TYPE)
        return if (token.equals(Config.NULL_TYPE, ignoreCase = true)) null else token
    }

    override fun setLoggedInUserToken(token: String?) {
        val t = token ?: Config.NULL_TYPE
        sharedPreferences.edit().putString(LOGGED_IN_USER_TOKEN, t).apply()
    }

    override fun setUserAsLoggedOut() {
        val editor = sharedPreferences.edit()
        editor.remove(IS_USER_LOGGED_IN)
        editor.remove(LOGGED_IN_USER_ID)
        editor.remove(LOGGED_IN_USER_NAME)
        editor.remove(LOGGED_IN_USER_TOKEN)
        editor.apply()
    }
}