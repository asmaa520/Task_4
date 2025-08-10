package com.asmaa.task_4

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.splash_screen);
        Handler(Looper.getMainLooper()).postDelayed({
            setContentView(R.layout.activity_main)
        }, 3000)
        val password = findViewById<EditText>(R.id.text3).toString()
        val confirmPassword =findViewById<EditText>(R.id.text4).toString()
        val btn_login =findViewById<Button>(R.id.btn1)
        val googleImage = findViewById<ImageView>(R.id.image2)
        val facebookImage = findViewById<ImageView>(R.id.image3)
        val twitterImage = findViewById<ImageView>(R.id.image4)


        btn_login.setOnClickListener{
            if (password==confirmPassword) Toast.makeText(this, "Succesfully Sign in", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "failed to sign in ", Toast.LENGTH_SHORT).show()
        }
        googleImage.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
        facebookImage.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"))
            startActivity(intent)
        }
        twitterImage.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"))
            startActivity(intent)
        }


    }
}




