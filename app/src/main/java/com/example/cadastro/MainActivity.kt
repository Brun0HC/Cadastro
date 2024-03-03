package com.example.cadastro

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var formulario: Formulario
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(amb.root)

        amb.btnSalvar.setOnClickListener{

            var nomeCompleto = amb.txtNomeCompleto.text.toString()
            var telefone = amb.txtTelefone.text.toString()
            var email = amb.txtEmail.text.toString()
            var listaEmail = amb.checkBoxListaEmail.isChecked
            var sexo = if(amb.radioGroupSexo.checkedRadioButtonId == amb.buttonMasculino.id )
                amb.buttonMasculino.text.toString() else amb.buttonFeminino.text.toString()
            var cidade = amb.txtCidade.text.toString()
            var uf = amb.spinnerUf.selectedItem.toString()



            formulario = Formulario(nomeCompleto, telefone, email, listaEmail, sexo, cidade, uf)
//            formulario.nomeCompleto = amb.txtNomeCompleto.text.toString()
//            formulario.telefone = amb.txtTelefone.text.toString()
//            formulario.email = amb.txtEmail.text.toString()
//            formulario.listaEmail = amb.checkBoxListaEmail.isChecked
//            formulario.sexo = if(amb.radioGroupSexo.checkedRadioButtonId == 0) "Masculino" else "Feminino"
//            formulario.cidade = amb.txtCidade.text.toString()
//            amb.spinnerUf.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
//                override fun onItemSelected(
//                    parent: AdapterView<*>?,
//                    view: View?,
//                    position: Int,
//                    id: Long
//                ) {
//                    formulario.uf = parent?.getItemAtPosition(position).toString()
//                }
//
//                override fun onNothingSelected(parent: AdapterView<*>?) {
//                    formulario.uf = "Piauí"
//                }
//            }
//        }.also {
            Toast.makeText(
                this@MainActivity,
                formulario.toString(),
                Toast.LENGTH_SHORT
            ).show()
            }

        amb.btnLimpar.setOnClickListener {
            limparCampos()
        }

     }
    private fun limparCampos (){
        amb.txtNomeCompleto.text.clear()
        amb.txtTelefone.text.clear()
        amb.txtEmail.text.clear()
        amb.txtCidade.text.clear()
        amb.checkBoxListaEmail.isChecked = false
        amb.radioGroupSexo.check(amb.buttonMasculino.id)
        amb.spinnerUf.setSelection(0)
    }

}