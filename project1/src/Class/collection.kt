package Class

fun main () {


    val li = listOf("SãoPaulo","Rio de janeiro")
    val l2 = mutableListOf("Madri","São Paulo","Berlim")

    val a1= arrayListOf("Madri","São Paulo","Berlim")

    val s1 = setOf("Madri","São Paulo","Berlim","Madri","São Paulo","Berlim") //não tem copia
    val s2 = mutableSetOf("Madri","São Paulo","Berlim","Madri","São Paulo","Berlim","Madri","São Paulo","Berlim")

    val h1 = hashMapOf<String,String>(Pair("key","value"),Pair("França","Paris"))


    println(h1["França"])


    print(s1.size)
}