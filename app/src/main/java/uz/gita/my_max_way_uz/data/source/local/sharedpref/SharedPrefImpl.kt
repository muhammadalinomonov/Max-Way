package uz.gita.my_max_way_uz.data.source.local.sharedpref

import android.content.SharedPreferences
import javax.inject.Inject

class SharedPrefImpl @Inject constructor(private val pref: SharedPreferences) : SharedPref {
    override var token: String
        set(value) {
            pref.edit().putString("TOKEN", value).apply()
        }
        get() = pref.getString("TOKEN", "").toString()

    override var hasToken: Boolean
        set(value) {
            pref.edit().putBoolean("HAS_TOKEN", value).apply()
        }
        get() = pref.getBoolean("HAS_TOKEN", false)

    override var phone: String
        set(value) {
            pref.edit().putString("PHONE", value).apply()
        }
        get() = pref.getString("PHONE", "").toString()


    override var password: String
        set(value) {
            pref.edit().putString("PAROL", value).apply()
        }
        get() = pref.getString("PAROL", "").toString()

    override var name: String
        set(value) {
            pref.edit().putString("NAME", value).apply()
        }
        get() = pref.getString("NAME", "").toString()

    override var birthday: String
        set(value) {
            pref.edit().putString("BIRTHDAY", value).apply()
        }
        get() = pref.getString("BIRTHDAY", "").toString()




}