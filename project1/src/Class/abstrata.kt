package Class


abstract class Mamifero(var nome: String) {

    var sono:Int = 8
    var peso:Float = 9f

    abstract fun falar()
    open fun dormir() {
        println ("dormindo $sono horas")
    }


}

class Cachorro(nome: String, peso: Float) : Mamifero(nome) {
    init {
        this.peso = peso
    }

    override fun falar() {
        println("au")
    }

    override fun dormir(){
        println("dormindo 9 horas")

    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miaw")
    }

 }

fun main(){

}