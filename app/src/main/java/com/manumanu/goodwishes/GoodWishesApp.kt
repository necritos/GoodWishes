package com.manumanu.goodwishes

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration



/**
 * Created by manu on 25/04/17.
 */

class GoodWishesApp : Application() {
    val REALM_NAME = "GoodWishesApp.realm"
    val REALM_SCHEMA_VERSION = 1

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        Realm.setDefaultConfiguration(getRealmConfiguration())
    }

    fun getRealmConfiguration(): RealmConfiguration {
        return RealmConfiguration.Builder()
                .name(REALM_NAME)
                .schemaVersion(REALM_SCHEMA_VERSION.toLong())
                .deleteRealmIfMigrationNeeded()
                .build()
    }

}
