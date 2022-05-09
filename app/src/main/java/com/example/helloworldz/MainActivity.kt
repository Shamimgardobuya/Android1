package com.example.helloworldz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    lateinit var btncalculate:Button
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btncalculate=findViewById(R.id.btnBMI)
        btncalculate.setOnClickListener{
            val intent=Intent(this,BMICalculate::class.java)
            startActivity(intent)
        }


          btnSendMoney=findViewById(R.id.btnSendMoney)
          btnSendMoney.setOnClickListener {
            val intent =Intent(this,SendMoney::class.java)
              startActivity(intent)
        }
        }
    }
