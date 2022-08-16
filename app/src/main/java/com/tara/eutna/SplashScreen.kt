package com.tara.eutna

import android.os.Bundle
import com.wishland.advertisement.ui.AdsActivity
import com.wishland.advertisement.ui.WebViewActivity


class SplashScreen : AdsActivity(test = false) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }

    override fun onAdsFallback() {
        startActivity(WebViewActivity.createIntent(this, "file:///android_asset/hot.html" ))
        finish()
    }

    override fun onAdsLinkLoaded(adsLink: String) {
        startActivity(WebViewActivity.createIntent(this, adsLink))
        finish()
    }

}