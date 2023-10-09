package br.com.sistemadereparo.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.sistemadereparo.whatsapp.databinding.ActivityCadastroBinding
import br.com.sistemadereparo.whatsapp.databinding.ActivityLoginBinding

class CadastroActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityCadastroBinding.inflate(layoutInflater)
    }

    private lateinit var name :String
    private lateinit var email :String
    private lateinit var senha :String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        inicializarToolbar()
        inicializarEventosClique()



    }

    private fun inicializarEventosClique() {
        binding.btncadastrar.setOnClickListener {
            if (validarCampos()){

            }
        }
    }

    private fun validarCampos():Boolean{

        name = binding.edtName.text.toString()
        email = binding.edtEmail.text.toString()
        senha = binding.edtSenha.text.toString()
        if (name.isNotEmpty()){
            binding.edtName.error=null
            if(email.isNotEmpty()){
                binding.edtEmail.error=null
                if(senha.isNotEmpty()){

                    binding.edtSenha.error=null
                    return true

                }else{
                    binding.edtSenha.error = "Preencha com uma senha!"
                    return false

                }
            }else{
                binding.edtEmail.error = "Preencha o seu email!"
                return false

            }
        }else{
            binding.edtName.error = "Preencha o seu nome!"
            return false
        }


    }

    private fun inicializarToolbar() {
        val toolbar = binding.includeToolbar.tbprincipal
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = " Faça seu cadastro"
            setDisplayHomeAsUpEnabled(true)
        }
    }
}