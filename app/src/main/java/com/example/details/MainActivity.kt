package com.example.details

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        about_us_btn.setOnClickListener {
            val intent=Intent(this,Aboutus::class.java)
            startActivity(intent)

        }
        contact_us_button.setOnClickListener {
            val intent=Intent(this,Contactus::class.java)
            startActivity(intent)
           // Toast.makeText(this,"contact us clicked",Toast.LENGTH_SHORT).show()
        }
        help_us_btn.setOnClickListener {
            val intent=Intent(this,Helpus::class.java)
            startActivity(intent)

        }
        feedback_btn.setOnClickListener {
            val intent=Intent(this,Feedback::class.java)
            startActivity(intent)

        }


    }
}
