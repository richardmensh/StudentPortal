package com.example.studentportal

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.student_portal_webview.*

class WebviewAppActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.student_portal_webview)

        val link = intent.getStringExtra("STUDENT_PORTAL_LINK")

        webview_student_portal.setBackgroundColor(Color.YELLOW)
        webview_student_portal.settings.javaScriptEnabled = true
        webview_student_portal.settings.loadWithOverviewMode = true
        webview_student_portal.settings.useWideViewPort = true
        webview_student_portal.loadUrl(link)
    }
}