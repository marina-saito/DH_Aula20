package com.example.exemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            showSnack("Olá!!")
        }
    }

    fun showSnack(msg: String) {
        val snack = Snackbar.make(layout_snack, msg, Snackbar.LENGTH_LONG) // o primeiro parametro é o layout dentro de onde o snackbar está
        snack.setAction("ok", View.OnClickListener {
            Log.i(TAG, "sucesso")
        })
        snack.show()

        // uma maneira mais direta seria: Snackbar.make(it,"Funcionou",3000).show()
    }

}