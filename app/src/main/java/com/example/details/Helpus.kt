package com.example.details

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_helpus.*

class Helpus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helpus)
        atach_btn_help.setOnClickListener {
            Log.d("Main","Try to show photo selecter")
            val intent=Intent(Intent.ACTION_PICK)
            intent.type="image/*"
            val email=findViewById<EditText>(R.id.email_et_help)
            startActivityForResult(intent,0)
        }
        submit_btn_help.setOnClickListener {
            Toast.makeText(this,"you have to code for saving this on firebase",Toast.LENGTH_SHORT).show()
        }
    }
    var selected_photo_uri: Uri? =null

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==0&&resultCode== Activity.RESULT_OK&&data!=null){
            //proceed and check what thee image is selected
            Log.d("Main","image is selected")
            selected_photo_uri=data.data
            val bitmap= MediaStore.Images.Media.getBitmap(contentResolver,selected_photo_uri)
            show_atach_help.setImageBitmap(bitmap)
           // SelectImage_button_register.alpha=0f
            //   val bitmapDrawable=BitmapDrawable(bitmap)
            //   SelectImage_button_register.setBackgroundDrawable(bitmapDrawable)
        }
    }

    /*please save help atachment to the fire base*/

}
