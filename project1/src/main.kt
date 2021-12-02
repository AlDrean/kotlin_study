import java.lang.NumberFormatException

fun calc(a: Int, b: Int, c: Int): Int {
    println("o bônus é: ${a + b + c}")
    return 0
}

fun compara(a: Int, b: Int): Int {

    return if (a > b)
        1
    else
        0
}

fun soma(a: Int, b: Int) = a + b

fun main() {
    try {
        println("asdasdad".toInt())

    }
    catch(e: NumberFormatException)
    {
        println("faz uma conversão de gente aii, por favor")
    }
    catch (e: Exception) {
        println("algo de errado não está certo")
    }
    finally {
        println("Deu ruim, ein?")
    }

    val str:String? = null
    println (str?.length)
    if (str== null) println ("nuuuuuulll")

    println(str!!.length)



}
