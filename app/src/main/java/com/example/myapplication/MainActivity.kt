package com.example.myapplication

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShow : Button = findViewById(R.id.button)

        btnShow.setOnClickListener{
            val message : String = "Are you ok"
            showCustomCreateDialogRoom(message)
        }
    }

    private fun showCustomCreateDialogRoom(message: String?) {
        val dia = Dialog(this);
        dia.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dia.setCancelable(false)
        dia.setContentView(R.layout.popup_menu)
        dia.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val inputID : TextInputEditText = dia.findViewById(R.id.title)

        val  btnYes : Button = dia.findViewById(R.id.btnYes)

        val  btnNo : Button = dia.findViewById(R.id.btnNo)

        inputID.setText(message)
        btnYes.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()

        }
        btnNo.setOnClickListener {
            Toast.makeText(this, "Click btn no ", Toast.LENGTH_LONG).show()
        }
        dia.show()
    }
}