package com.paradyme.solarsmashp.wwqwewqe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.paradyme.solarsmashp.databinding.ActivityFrsisdjwsadBinding
import kotlin.random.Random

class Frsisdjwsad : AppCompatActivity() {
    private lateinit var sldlowqodoqw : ActivityFrsisdjwsadBinding
    private var scaleTitx : Float = 1.0f
    private var scaleTity : Float = 1.0f
    val fijgjif = listOf(
        "Nature power x3",
        "Nature power x4",
        "Nature power x5",
        "Nature power x6",
        "Nature power x10",
        "Nature power x20",
        "Nature power x30",
        "Nature power x50",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sldlowqodoqw  = ActivityFrsisdjwsadBinding.inflate(layoutInflater)
        setContentView(sldlowqodoqw.root)
        woisdkosd()
        sldlowqodoqw.fokfodf.scaleX = scaleTitx
        sldlowqodoqw.wpqposkd.scaleX = scaleTitx
        sldlowqodoqw.xozoxckkxzc.scaleX = scaleTitx
        sldlowqodoqw.sodpdkckox.scaleX = scaleTitx
        sldlowqodoqw.fokfodf.scaleY = scaleTity
        sldlowqodoqw.wpqposkd.scaleY = scaleTity
        sldlowqodoqw.xozoxckkxzc.scaleY = scaleTity
        sldlowqodoqw.sodpdkckox.scaleY = scaleTity





    }

    @SuppressLint("ClickableViewAccessibility")
    private fun woisdkosd() = with(sldlowqodoqw){
        xioxckzjixc.setOnTouchListener(object : View.OnTouchListener {

            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    if(scaleTitx>=0.0f) {
                        scaleTitx -= 0.10f
                        scaleTity -= 0.10f
                    }
                    sldlowqodoqw.fokfodf.scaleX = scaleTitx
                    sldlowqodoqw.wpqposkd.scaleX = scaleTitx
                    sldlowqodoqw.xozoxckkxzc.scaleX = scaleTitx
                    sldlowqodoqw.sodpdkckox.scaleX = scaleTitx
                    sldlowqodoqw.fokfodf.scaleY = scaleTity
                    sldlowqodoqw.wpqposkd.scaleY = scaleTity
                    sldlowqodoqw.xozoxckkxzc.scaleY = scaleTity
                    sldlowqodoqw.sodpdkckox.scaleY = scaleTity

                    tvPoints.text = fijgjif[Random.nextInt(8)]



                    if(scaleTitx <= 0.0f){
                        startActivity(Intent(this@Frsisdjwsad,Cuxixushdu::class.java))
                    }
                    v?.animate()?.scaleX(0.99f)?.scaleY(0.99f)?.setDuration(0)
                } else if(event?.action == MotionEvent.ACTION_UP){
                    v?.animate()?.scaleX(1.0f)?.scaleY(1.0f)?.setDuration(0)
                }

                return true
            }

        })
    }
}