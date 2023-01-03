package com.paradyme.solarsmashp.wwqwewqe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paradyme.solarsmashp.databinding.ActivityCuxixushduBinding
import kotlin.random.Random

class Cuxixushdu : AppCompatActivity() {
    private lateinit var ksdmkasdm : ActivityCuxixushduBinding
    val roksdoodksoak = listOf(
        "You got 100xp nature power",
        "You got 300xp nature power",
        "You got 500xp nature power",
        "You got 800xp nature power",
        "You got 1000xp nature power",
        "You got 1200xp nature power",
        "You got 1500xp nature power",
        "You got 2000xp nature power",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ksdmkasdm = ActivityCuxixushduBinding.inflate(layoutInflater)
        setContentView(ksdmkasdm.root)

        ksdmkasdm.fogkog.setOnClickListener {
            startActivity(Intent(this,Frsisdjwsad::class.java))
        }

        ksdmkasdm.tvResInf.text = roksdoodksoak[Random.nextInt(8)]
    }
}