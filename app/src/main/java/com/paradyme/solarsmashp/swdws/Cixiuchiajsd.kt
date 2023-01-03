package com.paradyme.solarsmashp.swdws



import kotlinx.coroutines.Dispatchers
import com.orhanobut.hawk.Hawk

import kotlinx.coroutines.GlobalScope
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.paradyme.solarsmashp.R
import com.paradyme.solarsmashp.deefewfd.Btsusiwdsa
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.rokdkosf
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.gokfdidfij
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.xozkocsoka
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.cioxcvkoxoc
import com.paradyme.solarsmashp.wwqwewqe.Frsisdjwsad


import kotlinx.coroutines.launch

class Cixiuchiajsd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dudfhedsdf)
        dfkosdfsdf()
    }


    private fun gokkovbjiuhfhu() {
        val sdijsjisd = Intent(this@Cixiuchiajsd, Btsusiwdsa::class.java)
        startActivity(sdijsjisd)
        finish()
    }

    private fun yoifdjjgkogf() {
        val fokckovkoxkoc = Intent(this@Cixiuchiajsd, Frsisdjwsad::class.java)
        Hawk.put(cioxcvkoxoc, null)
        Hawk.put(xozkocsoka, null)
        startActivity(fokckovkoxkoc)
        finish()
    }


    private fun fokokfdjigjgf(): String? {
        val xzopzxlczx: String? = Hawk.get(rokdkosf)
        Log.d("ADACt Data", xzopzxlczx.toString())
        return xzopzxlczx
    }



    private fun dfkosdfsdf() {

        val cixvjjxicv = fokokfdjigjgf()

        if (cixvjjxicv == "0") {
            yoifdjjgkogf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                sdsdoksdo()
            }
            gokkovbjiuhfhu()
        }
    }
    private fun sdsdoksdo(){
        val ockvkocoxvk = AdvertisingIdClient(applicationContext)
        ockvkocoxvk.start()
        val fokdfokdfo = ockvkocoxvk.info.id
        Log.d("getAdvertisingId = ", fokdfokdfo.toString())
        Hawk.put(gokfdidfij, fokdfokdfo)
    }
















}