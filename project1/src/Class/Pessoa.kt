package Class

class Pessoa(var nome: String) {

    var ano: Int? = null

    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano

    }

    fun saudacao() {
        println("Olá, meu nome é: $nome")
    }
}

fun main() {
    var p = Pessoa("Lucas")

    p

}