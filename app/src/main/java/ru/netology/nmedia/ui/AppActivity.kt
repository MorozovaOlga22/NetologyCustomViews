package ru.netology.nmedia.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val customView = findViewById<StatsView>(R.id.stats)
        customView.data = listOf(
            0.25F,
            0.25F,
            0.25F,
            0.25F,
        )
        customView.dataNotFilled = 1.0F
    }
}