package com.pixeleasestudios.positivityapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private val quotesLIst = listOf(
    "Believe you can and you're halfway there",
    "The only way to do great work is to love what you do",
    "The harder you work for something, the greater you’ll feel when you achieve it",
    "Don't watch the clock, do what it does. Keep going",
    "Keep your face always toward the sunshine—and shadows will fall behind you",
    "Success is not final, failure is not fatal: It is the courage to continue that counts",
    "You are never too old to set another goal or to dream a new dream",
    "It always seems impossible until it's done",
    "Your limitation it's only your imagination"
)

private val authorsList = listOf(
    "Theodore Roosevelt",
    "Steve Jobs",
    "Sudhashree Acharya",
    "Sam Levenson",
    "Walt Whitman",
    "Winston Churchill",
    "C.S. Lewis",
    "Nelson Mandela",
    "Charles Kettering"
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        quoteDisplayer()
    }

    private fun quoteDisplayer() {
        val firstTextView: TextView = findViewById(R.id.firstTextView)
        val secondTextView: TextView = findViewById(R.id.secondTextView)
        val refreshButton: TextView = findViewById(R.id.refresh)

        refreshButton.setOnClickListener {

            refreshButton.setOnClickListener {
                val randomIndex = quotesLIst.indices.random()
                firstTextView.text = quotesLIst[randomIndex]
                secondTextView.text = authorsList[randomIndex]

                /*
                val random = (0 until quotesLIst.size).random()
                firstTextView.text = quotesLIst[random]
                secondTextView.text = authorsList[random]
                 */
            }
        }
    }
}
