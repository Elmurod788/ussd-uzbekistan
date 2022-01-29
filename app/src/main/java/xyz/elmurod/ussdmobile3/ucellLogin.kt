package xyz.elmurod.ussdmobile3

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ucellLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ucell_login)

    }
    private fun startPhoneActionIntent(phoneCode: String) {
        val requestCode = 1
        val phoneCode = "8123"
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("$phoneCode"))

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    requestCode)
            } else {
                startActivity(intent)
            }
        } else {
            startActivity(intent)
        }
}}