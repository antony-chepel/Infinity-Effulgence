package com.paradyme.solarsmashp.deefewfd

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Nwosoaiwas : Application() {
    companion object {
        var gokfdidfij: String? = "mainid"
        var cioxcvkoxoc = "geo"
        const val rokdsok = "b2c75e77-0988-4545-8c91-193667cd63e7"

        var eplp: String? = "d11"
        var xozkocsoka: String? = "countryCode"

        var rokdkosf = "appsChecker"
        var fiokockox: String? = "c11"
        var qpwksdosdk = "link"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(rokdsok)
        Hawk.init(this).build()
    }
}