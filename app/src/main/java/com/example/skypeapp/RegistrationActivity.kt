package com.example.skypeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import com.hbb20.CountryCodePicker

class RegistrationActivity : AppCompatActivity() {

    lateinit var cup: CountryCodePicker
    lateinit var phoneText: EditText
    lateinit var codeText: EditText
    lateinit var continueAndNextBtn: Button
    var checker: String = "Null"
    var phoneNumber: String = "Null"
    lateinit var relativeLayout: RelativeLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        phoneText = findViewById(R.id.phoneText)
        codeText = findViewById(R.id.codeText)
        continueAndNextBtn = findViewById(R.id.continueNextButton)
        relativeLayout = findViewById(R.id.phoneAuth)

    }
}
