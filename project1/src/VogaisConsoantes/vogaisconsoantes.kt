package VogaisConsoantes


fun countVowel(str:String):Int
{
    val vogais = "aeiou"
    var inVogais = 0

    for (letra in str)
        if (letra.lowercaseChar() in vogais)
            inVogais+=1


    return inVogais

}

fun countConsonant(str:String):Int{
    val consoantes="bcdfghjklmnpqrstvxwyz"
    var i_nConsoantes = 0

    for (letra in str)
        if (letra.lowercaseChar() in consoantes)
            i_nConsoantes+=1


    //should i use str.length - inVogais?

    return i_nConsoantes
    //return str.length - countVowel(str)
}