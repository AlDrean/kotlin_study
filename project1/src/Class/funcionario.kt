package Class

open class Funcionario() {
    open fun calculaBonus(){

    }
}

class Gerente(): Funcionario() {
    override fun calculaBonus(){
        println("gerente")
    }
}

class Tecnico(): Funcionario(){
    override fun calculaBonus(){
    println("funcionario")
    }
}

fun main()
{
    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()

    calculo(f1)
    calculo(f2)
}

fun calculo(f: Funcionario){
    return f.calculaBonus()
}
