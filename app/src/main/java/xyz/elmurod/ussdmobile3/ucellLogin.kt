package xyz.elmurod.ussdmobile3

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ucellLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ucell_login)
        val btn_call_center_Ucell = findViewById<Button>(R.id.btn_callCenter_Ucell)
        btn_call_center_Ucell.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:8123")
            startActivity(Intent.createChooser(intent, ""))}
        val btn_cabinet_Ucell =findViewById<Button>(R.id.btn_cabinet_Ucell)
        btn_cabinet_Ucell.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://my.ucell.uz/Account/Login?ReturnUrl=%2F"))
            startActivity(i)
        }
    }


}