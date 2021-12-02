class Pessoa1

class Pessoa2(var nome: String) {

    var ano: Int? = null

    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano

    }

    fun saudacao() {
        println("Olá, meu nome é: $nome")
    }
}

fun main() {

    val pessoa: Pessoa2 = Pessoa2("Gabriel", 1900)
    val pessoa2: Pessoa2 = Pessoa2("Marta", 1901)

    print(pessoa.nome)
    print(pessoa2.nome)

    pessoa.saudacao()
}


class Classes {


}


