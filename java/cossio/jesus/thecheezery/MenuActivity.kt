package cossio.jesus.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweet: Button = findViewById(R.id.button_sweets) as Button
        var btnSalt: Button = findViewById(R.id.button_salties) as Button

        btnCold.setOnClickListener{
             var intent: Intent= Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btnHot.setOnClickListener{
            var intent: Intent= Intent(this, Hot_Drinks::class.java)
            startActivity(intent)
        }

        btnSweet.setOnClickListener{
            var intent: Intent= Intent(this, Sweets::class.java)
            startActivity(intent)
        }

        btnSalt.setOnClickListener{
            var intent: Intent= Intent(this, Salties::class.java)
            startActivity(intent)
        }

    }
}