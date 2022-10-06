package com.gpaststudio.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainBtn.setOnClickListener {

//            다른화면으로 이동하기 (other->main)
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)


            finish()




        }

    }
}