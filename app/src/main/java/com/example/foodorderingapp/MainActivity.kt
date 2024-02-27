package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenerOnButtonClick()
    }

    private fun addListenerOnButtonClick() {
        val button : Button = findViewById(R.id.submitButton)
        val fries: CheckBox = findViewById(R.id.checkBox)
        val burger: CheckBox = findViewById(R.id.checkBox2)
        val pizza: CheckBox = findViewById(R.id.checkBox3)
        val cake: CheckBox = findViewById(R.id.checkBox4)
        val brownie: CheckBox = findViewById(R.id.checkBox5)

        button.setOnClickListener {
            var totalAmount = 0
            val result = StringBuilder()
            result.append("Selected Items:")
            if (brownie.isChecked) {
                result.append("\nFries 80Rs")
                totalAmount += 80
            }
            if (fries.isChecked) {
                result.append("\nFries 100Rs")
                totalAmount += 100
            }
            if (pizza.isChecked) {
                result.append("\nPizza 200Rs")
                totalAmount += 200
            }
            if (cake.isChecked) {
                result.append("\nCake 400Rs")
                totalAmount += 400
            }
            if (burger.isChecked) {
                result.append("\nBurger 50Rs")
                totalAmount += 50
            }
            result.append("\nTotal: $totalAmount Rs")
            // Displaying the message on the toast
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, BillActivity::class.java)
            intent.putExtra("bill",result.toString())
            startActivity(intent)
        }
    }
}