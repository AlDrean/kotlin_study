package VogaisConsoantes

import org.junit.Assert
import org.junit.Test

class VogaisConsoantesTest {

    @Test fun countVogais(){
        Assert.assertEquals(11,countVowel("Quantas vogais tem esta frase?"))
    }

    @Test fun countConsonants(){
        Assert.assertEquals(21,countConsonant("Geralmente uma frase possui mais consoantes!"))
    }

    @Test fun countVC()
    {
        var frase = "Estou gostando muito de aprender kotlin"
        Assert.assertEquals(15,countVowel(frase))
        Assert.assertEquals(19,countConsonant(frase))
    }
}