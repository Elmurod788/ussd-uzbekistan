package xyz.elmurod.ussdmobile3

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
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
    }

        }




