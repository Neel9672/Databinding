package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        var v1 = Vehicle()
        v1.name ="Mercdes"
        v1.ModelYear = "2024"
        binding.myVehicle = v1
        //binding.textView.text = v1.name

//        binding.button.setOnClickListener {
//
//        }
        binding.clickHandler = ClickHandlers(this)
    }


}