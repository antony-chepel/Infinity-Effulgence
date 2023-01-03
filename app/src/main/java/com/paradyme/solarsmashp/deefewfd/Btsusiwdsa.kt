package com.paradyme.solarsmashp.deefewfd
import java.util.concurrent.Executors
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.xozkocsoka
import java.util.concurrent.TimeUnit
import android.content.Intent
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.cioxcvkoxoc
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.fiokockox
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.paradyme.solarsmashp.databinding.ActivityDudfhedsdfBinding
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.eplp
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.rokdkosf


import com.paradyme.solarsmashp.wwqwewqe.Frsisdjwsad


class Btsusiwdsa : AppCompatActivity() {
    lateinit var ovkcjivcjicv: ActivityDudfhedsdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        ovkcjivcjicv = ActivityDudfhedsdfBinding.inflate(layoutInflater)
        setContentView(ovkcjivcjicv.root)

        val roekdosfkdf: String? = Hawk.get(rokdkosf, "null")

        if (roekdosfkdf == "1") {
            AppsFlyerLib.getInstance()
                .init("fmi6MHoBUJyst3Djtwm8GD", forkkodssdkofji, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        zxozxicjsuchas()

    }

    private fun tiifodkdfo() {
        val fodkfdfji = Intent(this@Btsusiwdsa, Frsisdjwsad::class.java)
        Hawk.put(cioxcvkoxoc, null)
        Hawk.put(xozkocsoka, null)
        startActivity(fodkfdfji)
        finish()
    }

    private fun zxozxicjsuchas() {

        val eokdifjidfs: String = Hawk.get(cioxcvkoxoc)
        val zoxozkcisj: String = Hawk.get(xozkocsoka, "null")

        val kxcoxcixcjiud: String? = Hawk.get(eplp, "null") //здесь нужен дефолтный ноль
        val rijdokfskoodfji: String? = Hawk.get(rokdkosf, "null")
        var vocvk: String? = Hawk.get(fiokockox)

        if (rijdokfskoodfji == "1") {
            Log.d("AppsChecker", rijdokfskoodfji)
            val eirdokfkosoksdf = Executors.newSingleThreadScheduledExecutor()
            eirdokfkosoksdf.scheduleAtFixedRate({
                if (vocvk != null) {

                    if (vocvk!!.contains("tdb2") || eokdifjidfs.contains(zoxozkcisj) || kxcoxcixcjiud!!.contains("tdb2")) {
                        Log.d("Apps Checker", "naming: $vocvk")
                        eirdokfkosoksdf.shutdown()
                        rokejidsokf()
                    } else {
                        eirdokfkosoksdf.shutdown()
                        tiifodkdfo()
                    }
                } else {
                    vocvk = Hawk.get(fiokockox)
                    Log.d("TestInUIHawk", "Received null $vocvk")
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (eokdifjidfs.contains(zoxozkcisj)) {
            rokejidsokf()
        } else {
            tiifodkdfo()
        }

    }
    private val forkkodssdkofji = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(eokdskod: MutableMap<String, Any>?) {
            val xzozxpco = eokdskod?.get("campaign").toString()
            Hawk.put(fiokockox, xzozxpco)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }





    private fun rokejidsokf() {
        val viccokcokc = Intent(this@Btsusiwdsa, Misusywidjsa::class.java)
        Hawk.put(cioxcvkoxoc, null)
        Hawk.put(xozkocsoka, null)
        startActivity(viccokcokc)
        finish()
    }






}