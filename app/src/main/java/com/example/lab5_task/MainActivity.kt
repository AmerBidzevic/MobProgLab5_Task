package com.example.lab5_task

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(Modifier.fillMaxSize()) {
                val context = LocalContext.current
                Button(
                    onClick = {
                        val intent = Intent(context, ForegroundService::class.java)
                        ContextCompat.startForegroundService(context, intent)
                    },
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Text("Start Service")
                }
            }
        }
    }
}