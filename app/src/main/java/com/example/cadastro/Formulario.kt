package com.example.cadastro

class Formulario(var nomeCompleto: String?,
                 var telefone: String?,
                 var email: String?,
                 var listaEmail: Boolean?,
                 var sexo: String?,
                 var cidade: String?,
                 var uf: String?) {

    override fun toString(): String {
        return "Nome Completo: $nomeCompleto\n" +
                "Telefone: $telefone\n" +
                "Email: $email\n" +
                "Ingressar na lista de e-mails? $listaEmail\n" +
                "Sexo: $sexo\n" +
                "Cidade: $cidade\n" +
                "UF: $uf"
    }

}
