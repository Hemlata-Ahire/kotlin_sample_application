package com.example.game_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GamrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(GameView(this))
    }
}