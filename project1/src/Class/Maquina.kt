package Class

open class Maquina(var marca: String) {
    var nucleos: Int = 0

    open fun minhaMarca() {
        println("Minha marca é $marca")
    }

   open fun ligar() {

    }

    open fun processar() {

    }

    open fun desligar() {

    }
}


class Computador(marca: String, nucleos: Int) : Maquina {

    override fun minhaMarca() {
        super.minhaMarca()
        println(" setor de computação")
    }

    override fun ligar() {

    }

    override fun desligar() {

    }

    fun overload(i:Int) = println("Overload $i")
    fun overload(i:Float) =println("Overload $i")

}

fun main() {
    var m = Maquina("BMW")

    with(m) {
        ligar()
        processar()
        desligar()
    }

    val c = Computador("Intel",10)

    println(m.nucleos)

    m.nucleos = 10

    println(m.nucleos)
}