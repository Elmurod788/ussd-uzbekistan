package xyz.elmurod.ussdmobile3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_share -> Toast.makeText(this, "share", Toast.LENGTH_SHORT).show()
            R.id.nav_rate -> Toast.makeText(this, "rate", Toast.LENGTH_SHORT).show()
            R.id.nav_connect -> Toast.makeText(this, "connect us", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mobiuz = findViewById<Button>(R.id.mobiuz)
        val beeline = findViewById<Button>(R.id.beeline)
        val ucell = findViewById<Button>(R.id.ucell)
        val uzmobile = findViewById<Button>(R.id.uzmobile)
        val btn_main = findViewById<Button>(R.id.btn_main)
        val btn_cabinet = findViewById<Button>(R.id.btn_cabinet)
        val btn_callCenter = findViewById<Button>(R.id.btn_callCenter)
        mobiuz.setOnClickListener {
            val intent = Intent(this, mobiuzLogin::class.java)
            startActivity(intent)
        }
        beeline.setOnClickListener {
            val intent = Intent(this, beelineLogin::class.java)
            startActivity(intent)
        }
        ucell.setOnClickListener {
            val intent = Intent(this, ucellLogin::class.java)
            startActivity(intent)
        }
        uzmobile.setOnClickListener {
            val intent = Intent(this, uzmobileLogin::class.java)
            startActivity(intent)
        }
        btn_main.setOnClickListener {
            Toast.makeText(this, "You are in the main screen", Toast.LENGTH_SHORT).show()
        }
        btn_cabinet.setOnClickListener {
            Toast.makeText(this, "Choose the company", Toast.LENGTH_SHORT).show()
        }
        btn_callCenter.setOnClickListener {
            Toast.makeText(this, "Choose the company", Toast.LENGTH_SHORT).show()
        }



    }
}




