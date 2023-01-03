package com.paradyme.solarsmashp.deefewfd
import android.content.pm.PackageManager
import android.net.Uri
import android.annotation.SuppressLint
import android.app.Activity

import java.io.IOException
import android.widget.Toast
import android.util.Log
import android.webkit.*

import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import android.content.Intent




import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore

import com.orhanobut.hawk.Hawk
import com.paradyme.solarsmashp.R
import com.paradyme.solarsmashp.databinding.ActivityAfredsfedsBinding
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.qpwksdosdk
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.eplp
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.gokfdidfij
import com.paradyme.solarsmashp.deefewfd.Nwosoaiwas.Companion.fiokockox


import org.json.JSONException
import org.json.JSONObject

import java.io.File


class Misusywidjsa : AppCompatActivity() {
    var difjdfij: String? = null
    var fiofodkfdok = ""
    var sapdoasdkoasd: ValueCallback<Array<Uri>>? = null
    lateinit var fokdokfoksdf: WebView
    lateinit var cxovkxkco: ActivityAfredsfedsBinding
    var epsld = ""
    private val dofks = 1
    private var xzopckozxc = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cxovkxkco = ActivityAfredsfedsBinding.inflate(layoutInflater)
        setContentView(cxovkxkco.root)

        fokdokfoksdf = cxovkxkco.gidfo
        Snackbar.make(
            cxovkxkco.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val fokgokdf = CookieManager.getInstance()
        fokgokdf.setAcceptCookie(true)
        fokgokdf.setAcceptThirdPartyCookies(fokdokfoksdf, true)
        roekkookdkofs()
        val dfofkokdf: Activity = this
        fokdokfoksdf.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(coxkoxcvkoxcv: WebView, ropekokods: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(ropekokods)) {
                        return false
                    }
                    if (forkkodoks(ropekokods)) {

                        val coxvokxcv = Intent(Intent.ACTION_VIEW)
                        coxvokxcv.data = Uri.parse(ropekokods)
                        startActivity(coxvokxcv)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                coxkoxcvkoxcv.loadUrl(ropekokods)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

                fodkdkof(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(dfofkokdf, description, Toast.LENGTH_SHORT).show()
            }


        }
        fokdokfoksdf.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                gokvkc: WebView, ockoxkcv: ValueCallback<Array<Uri>>,
                rokekokodfji: FileChooserParams
            ): Boolean {
                sapdoasdkoasd?.onReceiveValue(null)
                sapdoasdkoasd = ockoxkcv
                var bokvkovbjivb: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (bokvkovbjivb!!.resolveActivity(packageManager) != null) {

                    var difjdisfj: File? = null
                    try {
                        difjdisfj = gokkofdijdjif()
                        bokvkovbjivb.putExtra("PhotoPath", difjdfij)
                    } catch (ex: IOException) {

                    }

                    if (difjdisfj != null) {
                        difjdfij = "file:" + difjdisfj.absolutePath
                        bokvkovbjivb.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(difjdisfj)
                        )
                    } else {
                        bokvkovbjivb = null
                    }
                }
                val vockkocvcv = Intent(Intent.ACTION_GET_CONTENT)
                vockkocvcv.addCategory(Intent.CATEGORY_OPENABLE)
                vockkocvcv.type = "image/*"
                val diokfdkfoksof: Array<Intent?> =
                    bokvkovbjivb?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val eokwkoidsjijadija = Intent(Intent.ACTION_CHOOSER)
                eokwkoidsjijadija.putExtra(Intent.EXTRA_INTENT, vockkocvcv)
                eokwkoidsjijadija.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                eokwkoidsjijadija.putExtra(Intent.EXTRA_INITIAL_INTENTS, diokfdkfoksof)
                startActivityForResult(
                    eokwkoidsjijadija, dofks
                )
                return true
            }

            @Throws(IOException::class)
            private fun gokkofdijdjif(): File {
                var dokfdkos = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!dokfdkos.exists()) {
                    dokfdkos.mkdirs()
                }

                dokfdkos =
                    File(dokfdkos.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return dokfdkos
            }

        }

        fokdokfoksdf.loadUrl(fijdjiijcxijxcxco())
    }



    private fun forkkodoks(wopsplad: String): Boolean {

        val cvokcvxok = packageManager
        try {

            cvokcvxok.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }



    override fun onActivityResult(rokdsfok: Int, dplcxlpxc: Int, qowkisjd: Intent?) {
        if (rokdsfok != dofks || sapdoasdkoasd == null) {
            super.onActivityResult(rokdsfok, dplcxlpxc, qowkisjd)
            return
        }
        var okcovkoxcv: Array<Uri>? = null


        if (dplcxlpxc == AppCompatActivity.RESULT_OK) {
            if (qowkisjd == null || qowkisjd.data == null) {

                okcovkoxcv = arrayOf(Uri.parse(difjdfij))
            } else {
                val orkookosdf = qowkisjd.dataString
                if (orkookosdf != null) {
                    okcovkoxcv = arrayOf(Uri.parse(orkookosdf))
                }
            }
        }
        sapdoasdkoasd?.onReceiveValue(okcovkoxcv)
        sapdoasdkoasd = null
    }


    override fun onBackPressed() {


        if (fokdokfoksdf.canGoBack()) {
            if (xzopckozxc) {
                fokdokfoksdf.stopLoading()
                fokdokfoksdf.loadUrl(epsld)
            }
            this.xzopckozxc = true
            fokdokfoksdf.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                xzopckozxc = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun roekkookdkofs() {
        val dokdsokcxi = fokdokfoksdf.settings
        dokdsokcxi.javaScriptCanOpenWindowsAutomatically = true
        dokdsokcxi.setAppCacheEnabled(true)
        dokdsokcxi.allowFileAccess = true
        dokdsokcxi.pluginState = WebSettings.PluginState.ON
        dokdsokcxi.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        dokdsokcxi.displayZoomControls = false
        dokdsokcxi.setSupportZoom(true)
        dokdsokcxi.javaScriptEnabled = true
        dokdsokcxi.allowContentAccess = true
        dokdsokcxi.loadWithOverviewMode = true
        dokdsokcxi.builtInZoomControls = true
        dokdsokcxi.setSupportMultipleWindows(false)

        dokdsokcxi.domStorageEnabled = true
        dokdsokcxi.userAgentString = dokdsokcxi.userAgentString.replace("; wv", "")
        dokdsokcxi.useWideViewPort = true




    }
    private fun fijdjiijcxijxcxco(): String {
        val xiozxkc = "naming"
        val fdlpdf = "sub_id_6="
        val difjjisdf = "com.paradyme.solarsmashp"
        val rokkdosf = "deviceID="

        val cuhxvhc = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val fokdkodf = "ad_id="
        val ocvkobkv = "sub_id_4="

        val qoksdkodsokoksd = "deeporg"
        val cixvjcixji = "sub_id_5="

        val ofkdkodf = "sub_id_1="
        val dokfdfkseijjief = Build.VERSION.RELEASE
        val qopsokda = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val cioxvoxckxcv: String? = Hawk.get(eplp, "null")

        val disdjf:String? = Hawk.get(fiokockox, "null")
        val riodokfo = Hawk.get(qpwksdosdk, "null")

        val woksd: String? = Hawk.get(gokfdidfij, "null")
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        if (disdjf != "null"){
            fiofodkfdok = "$riodokfo$ofkdkodf$disdjf&$rokkdosf$qopsokda&$fokdkodf$woksd&$ocvkobkv$difjjisdf&$cixvjcixji$dokfdfkseijjief&$fdlpdf$xiozxkc"
            dosdksdkfsdfef(qopsokda.toString())
        } else {
            fiofodkfdok = "$riodokfo$ofkdkodf$cioxvoxckxcv&$rokkdosf$qopsokda&$fokdkodf$woksd&$ocvkobkv$difjjisdf&$cixvjcixji$dokfdfkseijjief&$fdlpdf$qoksdkodsokoksd"
            dosdksdkfsdfef(qopsokda.toString())
        }

        Log.d("TESTAG", "Test Result $fiofodkfdok")
        return cuhxvhc.getString("SAVED_URL", fiofodkfdok).toString()
    }



    private fun dosdksdkfsdfef(coxkoxckx: String) {
        OneSignal.setExternalUserId(
            coxkoxckx,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(vocockv: JSONObject) {
                    try {
                        if (vocockv.has("push") && vocockv.getJSONObject("push").has("success")) {
                            val eoksodkaok = vocockv.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $eoksodkaok"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (vocockv.has("email") && vocockv.getJSONObject("email").has("success")) {
                            val dppspcoxkxcv =
                                vocockv.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $dppspcoxkxcv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (vocockv.has("sms") && vocockv.getJSONObject("sms").has("success")) {
                            val qowiosjijdiajsdkoasd = vocockv.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $qowiosjijdiajsdkoasd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }





    fun fodkdkof(fodkkosdfko: String?) {
        if (!fodkkosdfko!!.contains("t.me")) {

            if (epsld == "") {
                epsld = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    fodkkosdfko
                ).toString()

                val foodfkg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val woksdo = foodfkg.edit()
                woksdo.putString("SAVED_URL", fodkkosdfko)
                woksdo.apply()
            }
        }
    }










}