package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val trueButton = findViewById<Button>(R.id.true_button)
        val falseButton = findViewById<Button>(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            Toast
                .makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT)
                .show()
        }

        falseButton.setOnClickListener { view: View ->
            Toast
                .makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT)
                .show()
        }

    }
}