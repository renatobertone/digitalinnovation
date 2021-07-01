package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Renato"
    var cpf: String = "123.123.123.11"
    private set

    constructor()

    fun pessoInfo() = "$nome e $cpf"
}

fun main() {
    val teste = Pessoa() // Variável teste para chamar a classe Pessoa.
    println(teste.pessoInfo())
}