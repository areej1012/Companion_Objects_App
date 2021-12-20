package com.example.companionobjectsapp

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.companionobjectsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if(checkedId == R.id.rbDay){
                binding.ly.background = ContextCompat.getDrawable(this, backgroung.day)
                binding.textView.setTextColor(ContextCompat.getColor(this,R.color.black))
                binding.rbNight.setTextColor( ContextCompat.getColor(this,R.color.black))
                binding.rbDay.setTextColor( ContextCompat.getColor(this,R.color.black))
            }
            else if (checkedId == R.id.rbNight){
                binding.ly.background = ContextCompat.getDrawable(this, backgroung.night)
                binding.textView.setTextColor(ContextCompat.getColor(this,R.color.white))
                binding.rbNight.setTextColor( ContextCompat.getColor(this,R.color.white))
                binding.rbDay.setTextColor( ContextCompat.getColor(this,R.color.white))
            }
        }
    }
}