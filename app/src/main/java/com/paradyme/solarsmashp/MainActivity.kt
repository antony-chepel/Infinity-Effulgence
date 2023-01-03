package com.paradyme.solarsmashp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.paradyme.solarsmashp.databinding.ActivityMainBinding
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.qpwksdosdk
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.eplp
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.rokdkosf
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.xozkocsoka
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.cioxcvkoxoc
import com.paradyme.solarsmashp.swdws.Gkxxisjdsa
import com.paradyme.solarsmashp.swdws.Cixiuchiajsd
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var oksadko: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        oksadko = ActivityMainBinding.inflate(layoutInflater)
        setContentView(oksadko.root)

        eijjisdako(this)

        val zokzxkxzosj = Executors.newSingleThreadScheduledExecutor()
        var owkdkwo: String? = Hawk.get(xozkocsoka, null)
        var fdidfok: String? = Hawk.get(cioxcvkoxoc, null)
        zokzxkxzosj.scheduleAtFixedRate({
            if (owkdkwo != null && fdidfok != null) {
                zokzxkxzosj.shutdown()
                bovknkovo()
            } else {
                owkdkwo = Hawk.get(xozkocsoka)
                fdidfok = Hawk.get(cioxcvkoxoc)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch (Dispatchers.IO){
            figjiggf
        }
    }

    fun eijjisdako(biokvb: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            biokvb
        ) { dpellpds: AppLinkData? ->
            dpellpds?.let {
                val cxivj = dpellpds.targetUri.host.toString()
                Hawk.put(eplp, cxivj)
            }
        }
    }

    private suspend fun goktokgkgr() {
        val ciuvjdus = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Gkxxisjdsa::class.java)
        val obkvokv = ciuvjdus.fpvlcv().body()?.sidjsdji
        Log.d("Data from API", obkvokv.toString())

        Hawk.put(xozkocsoka, obkvokv)
    }

    private fun bovknkovo() {
        val rijjisd = Intent(this@MainActivity, Cixiuchiajsd::class.java)
        startActivity(rijjisd)
        finish()
    }

    private suspend fun doeksdi() {
        val cvjixv = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://infinityeffulgence.live/")
            .build()
            .create(Gkxxisjdsa::class.java)
        val sdokwk = cvjixv.sijd().body()?.eooksdkos.toString()
        val ovbk = cvjixv.sijd().body()?.dopssdp.toString()
        val rpokdsoji = cvjixv.sijd().body()?.fokcxkoc.toString()


        Hawk.put(qpwksdosdk, sdokwk)
        Hawk.put(rokdkosf, ovbk)
        Hawk.put(cioxcvkoxoc, rpokdsoji)

    }

    private val figjiggf: Job = GlobalScope.launch (Dispatchers.IO){
        goktokgkgr()
        doeksdi()
    }

}