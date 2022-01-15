package com.example.broadcastlistener

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {
        if (p1 != null) {
            val title = p1.getStringExtra(TITLE_TAG)
            val text = p1.getStringExtra(TEXT_TAG)

            Log.d(LOG_FILTER, "Title:$title; Text: $text")
        }
    }

    companion object {

        const val INTENT_TAG = "intent_tag"

        private const val TITLE_TAG = "title_tag"
        private const val TEXT_TAG = "text_tag"

        private const val LOG_FILTER = "Notes"
    }
}