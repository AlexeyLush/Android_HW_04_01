package kz.step.android_hw_04_01

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var buttonSend: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        buttonSend = findViewById(R.id.button_send)
    }

    private fun initializeLiseners() {
        buttonSend?.setOnClickListener {
            val message = "“Hello i have written Intent which\n" +
                    "sending you this message"

            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.setPackage("com.whatsapp")
            intent.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(intent)
        }
    }
}