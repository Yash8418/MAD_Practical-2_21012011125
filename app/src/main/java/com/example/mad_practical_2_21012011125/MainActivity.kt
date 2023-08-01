package com.example.mad_practical_2_21012011125

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("OnResume() method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("OnPause method is called")

    }

    override fun onStop() {
        super.onStop()
        showMessage("OnStop() method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("OnDestroy() method is called")
    }
    override fun onRestart() {
        super.onRestart()
        showMessage("OnRestart() method is called")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        val v=findViewById<ConstraintLayout>(R.id.mainLayout)
        if(v!=null){
            Snackbar.make(v,msg,Snackbar.LENGTH_SHORT).show()
        }

    }
}
