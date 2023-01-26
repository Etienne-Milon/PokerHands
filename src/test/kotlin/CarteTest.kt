import org.junit.jupiter.api.Assertions.*

internal class CarteTest {

    @org.junit.jupiter.api.Test
    fun compareTo() {
        assertTrue(Carte("Trèfle",Pair("2",2)).equals(Carte("Carreau",Pair("2",2))))
        assertTrue(Carte(TRÈFLE,DEUX).equals(Carte(CARREAU,DEUX)))
        assertTrue(Carte(TRÈFLE,DEUX) == Carte(CARREAU,DEUX))
        assertTrue(Carte(CARREAU,NEUF) < Carte(TRÈFLE,AS))
    }
}