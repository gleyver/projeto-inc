package br.com.apredendojavakotlin.lfoda

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.annotation.TargetApi
import android.content.pm.PackageManager
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.app.LoaderManager.LoaderCallbacks
import android.content.CursorLoader
import android.content.Loader
import android.database.Cursor
import android.net.Uri
import android.os.AsyncTask
import android.os.Build
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.ArrayAdapter
import android.widget.TextView

import java.util.ArrayList
import android.Manifest.permission.READ_CONTACTS
import android.content.Intent
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_login.*

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : AppCompatActivity(){
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        btn_entrar.setOnClickListener {

            val usuario = txt_usuario.text.toString()
            val senha = txt_senha.text.toString()

            if (usuario.equals("gleyver") and senha.equals("gostoso")){

                val intent = Intent(this, MapsActivity::class.java)
                startActivity(intent)

            }else{
                Toast.makeText(this, "Digita Certo carai", Toast.LENGTH_LONG).show()
            }

        }
    }

}
