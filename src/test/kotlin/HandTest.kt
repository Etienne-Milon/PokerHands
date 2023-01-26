import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HandTest {
    
    var quinte_flush_A = Hand(Carte(CŒUR,AS),Carte(CŒUR,ROI),Carte(CŒUR,DAME),Carte(CŒUR,VALET),Carte(CŒUR,DIX))
    var quinte_flush_V = Hand(Carte(CŒUR,VALET),Carte(CŒUR,NEUF),Carte(CŒUR,HUIT),Carte(CŒUR,DIX),Carte(CŒUR,SEPT))
    var carre_AAAA_2 = Hand(Carte(CŒUR,AS),Carte(PIQUE,AS),Carte(CARREAU,AS),Carte(TRÈFLE,AS),Carte(TRÈFLE,DEUX))
    var carre_AAAA_R = Hand(Carte(CŒUR,AS),Carte(PIQUE,AS),Carte(CARREAU,AS),Carte(TRÈFLE,AS),Carte(TRÈFLE,ROI))
    var full_222_RR = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(CARREAU,ROI),Carte(TRÈFLE,ROI))
    var full_222_DD = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(CARREAU,DAME),Carte(TRÈFLE,DAME))
    var deuxPairs_22_44_R = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,QUATRE),Carte(TRÈFLE,QUATRE),Carte(TRÈFLE,ROI))
    var deuxPairs_22_44_D = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,QUATRE),Carte(TRÈFLE,QUATRE),Carte(TRÈFLE,DAME))
    var deuxPairs_44_22_D = Hand(Carte(TRÈFLE,QUATRE),Carte(PIQUE,QUATRE),Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DAME))

    @Test
    fun evaluate2() {
    }

    @Test
    fun compareTo() {
        assertTrue(quinte_flush_A > quinte_flush_V)
        assertTrue(quinte_flush_V > carre_AAAA_R)
        assertTrue(carre_AAAA_R > carre_AAAA_2)
        assertTrue(carre_AAAA_2 > full_222_RR)
        assertTrue(full_222_RR > full_222_DD)
        assertTrue(full_222_DD > deuxPairs_22_44_R)
        assertTrue(deuxPairs_22_44_D == deuxPairs_44_22_D)

    }
}