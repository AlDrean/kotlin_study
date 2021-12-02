package reverseTest

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
    //@why use string buider?
    //StringBuilder creates a single internal buffer that contains the final string.


    //return str.reversed()
}

fun reverseUsingLoop(str: String): String {
    var saida: String = ""

    for (i in str.length-1 downTo 0) {
        saida += str[i]
    }

    return saida
}