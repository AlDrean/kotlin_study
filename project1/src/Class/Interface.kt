package Class

interface Pokemon {
    var vida:Int
    var status:Int

}

class Snorlax{

}



interface interface1{
    fun ola()

}

interface interface2{
    fun ola()
    fun helo()
}


class ImplementaInterface(name:String):interface1,interface2{
   override  fun ola()
   {
      // super<interface1>.ola()

   }

    override fun helo() {

    }
}