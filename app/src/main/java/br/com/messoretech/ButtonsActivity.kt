package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityButtonsBinding

class ButtonsActivity : AppCompatActivity(){
    private  val bindind by lazy { ActivityButtonsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindind.root)
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, ButtonsActivity:: class.java)
    }
}
