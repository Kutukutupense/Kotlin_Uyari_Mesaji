package com.example.uyari_mesajlari

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uyari_mesajlari.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        Toast.makeText(this,"Hoşgeldin Gral",Toast.LENGTH_LONG).show()



    }
    fun mesajGoster(view: View){
        val uyariMesaji = AlertDialog.Builder(this)
        uyariMesaji.setTitle("Hata Bulundu!")
        uyariMesaji.setMessage("Şifreyi Hatalı Girdiniz!")
        uyariMesaji.setNeutralButton("Tekrar Dene",DialogInterface.OnClickListener { dialog, which ->
        Toast.makeText(this,"Tekrar Deneniyor!",Toast.LENGTH_LONG).show()
        })
        uyariMesaji.setNegativeButton("Iptal",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this,"İptal Edildi!",Toast.LENGTH_LONG).show()
        })
        
        uyariMesaji.show()
    }
}