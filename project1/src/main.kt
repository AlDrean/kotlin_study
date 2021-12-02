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
    val a = 10
    val b = 20
    val c = 30

    calc(a, b, c)
    println("soma é ${soma(a, b)}")

    var numero = 10
    println("compara = ${compara(a, b)}")

    numero = if (numero == 10) 1 else 2
    println("${numero}")

    // && and ||
    // ?: -> elvis para verficar nullabilidade
    //definição em var x:Int? == null

}