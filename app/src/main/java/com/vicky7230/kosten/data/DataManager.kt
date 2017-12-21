package com.vicky7230.kosten.data

import com.vicky7230.kosten.data.db.DbHelper
import com.vicky7230.kosten.data.network.ApiHelper
import com.vicky7230.kosten.data.prefs.PreferencesHelper

/**
 * Created by vicky on 21/12/17.
 */
interface DataManager : DbHelper, ApiHelper, PreferencesHelper {
}