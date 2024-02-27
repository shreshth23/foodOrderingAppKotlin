package com.example.foodorderingapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BillActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)
        val intent = getIntent()
        val billData = intent.getStringExtra("bill")

        val textViewBill: TextView = findViewById(R.id.billTextView)
        textViewBill.text = billData
    }
}