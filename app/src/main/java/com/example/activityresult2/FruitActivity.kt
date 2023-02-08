package com.example.activityresult2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FruitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

        val messageTextView = findViewById<TextView>(R.id.message_textView)

       val name: String? = intent.extras?.getString("name_key") ?: "No name"
        messageTextView.text = name

        val appleButton = findViewById<Button>(R.id.apple_button)
        val bananaButton = findViewById<Button>(R.id.banana_button)

        appleButton.setOnClickListener{
          val  intent = Intent()
            intent.putExtra("result_fruit", "Apple")
            setResult(RESULT_OK, intent)
            finish()

        }

        bananaButton.setOnClickListener{
            val  intent = Intent()
            intent.putExtra("result_fruit", "Banana")
            setResult(RESULT_OK, intent)
            finish()
        }   }
}