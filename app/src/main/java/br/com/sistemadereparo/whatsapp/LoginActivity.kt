package br.com.sistemadereparo.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.sistemadereparo.whatsapp.databinding.ActivityLoginBinding
import br.com.sistemadereparo.whatsapp.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarEventosClique()
    }

    private fun inicializarEventosClique() {
        binding.txtCadastro.setOnClickListener {
            startActivity( Intent(this,CadastroActivity::class.java))
        }
    }
}