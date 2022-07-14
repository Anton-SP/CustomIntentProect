package com.example.customintentproect.intent

import android.content.Intent
import android.widget.Toast
import com.example.customintentproect.app

class CustomIntentServiceImp:CustomIntentService() {


    override fun onHandleIntent(intent: Intent) {
        var status = intent?.getStringExtra("status")
        Toast.makeText(app,"Response status: " + status,Toast.LENGTH_SHORT).show()
    }
}