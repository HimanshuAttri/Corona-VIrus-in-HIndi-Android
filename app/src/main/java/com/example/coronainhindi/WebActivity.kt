package com.example.coronainhindi

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.MobileAds


class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)


        val link = intent.getStringExtra("link")
        val title = intent.getStringExtra("title")
        setTitle(title)
        MobileAds.initialize(this) {}


        val web : WebView = findViewById(R.id.web)
        web.settings.javaScriptEnabled = true
        web.settings.loadWithOverviewMode = true
        web.settings.useWideViewPort = true
        web.settings.domStorageEnabled = true
        web.webViewClient = WebViewClient()
        // Toast.makeText(applicationContext,link,Toast.LENGTH_SHORT).show()
        web.loadUrl(link)
    }

}
