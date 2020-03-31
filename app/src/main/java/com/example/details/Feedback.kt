package com.example.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_feedback.*

class Feedback : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        val email=findViewById<EditText>(R.id.email_et_help)
        val feedback=findViewById<EditText>(R.id.feed_desription_feedback)
        feed_desription_feedback.setOnClickListener {
            Toast.makeText(this,"feedback work is not fully devoloped ",Toast.LENGTH_SHORT).show()
        }
    }
}
