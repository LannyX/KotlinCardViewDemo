package com.lanny.kotlincardviewdemo.kotlincard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lanny.kotlincardviewdemo.R

class KotlinCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_card)

        if(savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.frameLayoutContainer, KotlinCardFragment())
                .commit()
        }


    }
}
