package com.example.activityresult2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.input_name)
        resultTextView = findViewById(R.id.result_textView)


        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener {

            val inputName = editText.text.toString()
            val intent = Intent(this, FruitActivity::class.java)
            intent.putExtra("name_key", inputName )
            startActivityForResult(intent, 1)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode ==1){
           val fruitString: String? = data?.extras?.getString("result_fruit")
            resultTextView.text = fruitString.toString()
        }


    }
}