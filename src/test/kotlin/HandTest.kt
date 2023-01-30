import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HandTest {
    
    var quinte_flush_A = Hand(Carte(CŒUR,AS),Carte(CŒUR,ROI),Carte(CŒUR,DAME),Carte(CŒUR,VALET),Carte(CŒUR,DIX))
    var quinte_flush_V = Hand(Carte(CŒUR,VALET),Carte(CŒUR,NEUF),Carte(CŒUR,HUIT),Carte(CŒUR,DIX),Carte(CŒUR,SEPT))
    var carre_AAAA_2 = Hand(Carte(CŒUR,AS),Carte(PIQUE,AS),Carte(CARREAU,AS),Carte(TRÈFLE,AS),Carte(TRÈFLE,DEUX))
    var carre_AAAA_R = Hand(Carte(CŒUR,AS),Carte(PIQUE,AS),Carte(CARREAU,AS),Carte(TRÈFLE,AS),Carte(TRÈFLE,ROI))
    var full_222_RR = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(CARREAU,ROI),Carte(TRÈFLE,ROI))
    var full_222_DD = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(CARREAU,DAME),Carte(TRÈFLE,DAME))
    var couleur_1_2_4_5_6 = Hand(Carte(TRÈFLE,AS),Carte(TRÈFLE,DEUX),Carte(TRÈFLE,QUATRE),Carte(TRÈFLE,CINQ),Carte(TRÈFLE,SIX))
    var quinte_V_9_8_10_7 = Hand(Carte(CŒUR,VALET),Carte(PIQUE,NEUF),Carte(CŒUR,HUIT),Carte(CŒUR,DIX),Carte(CŒUR,SEPT))
    var brelan_R_A_777 = Hand(Carte(CŒUR,ROI),Carte(PIQUE,AS),Carte(CARREAU,SEPT),Carte(PIQUE,SEPT),Carte(TRÈFLE,SEPT))
    var deuxPairs_22_44_R = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,QUATRE),Carte(TRÈFLE,QUATRE),Carte(TRÈFLE,ROI))
    var deuxPairs_22_44_D = Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,QUATRE),Carte(TRÈFLE,QUATRE),Carte(TRÈFLE,DAME))
    var deuxPairs_44_22_D = Hand(Carte(TRÈFLE,QUATRE),Carte(PIQUE,QUATRE),Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DAME))
    var unePaire_7_99_8_D = Hand(Carte(TRÈFLE,SEPT),Carte(PIQUE,NEUF),Carte(CŒUR,NEUF),Carte(PIQUE,HUIT),Carte(CARREAU,DAME))
    var carteHaute_1_2_4_5_6 = Hand(Carte(TRÈFLE,AS),Carte(CARREAU,DEUX),Carte(CŒUR,QUATRE),Carte(PIQUE,CINQ),Carte(PIQUE,SIX))

    @Test
    fun evaluate1() {
        assertEquals(1,carteHaute_1_2_4_5_6.evaluate1())
        assertEquals(2,unePaire_7_99_8_D.evaluate1())
        assertEquals(3,deuxPairs_22_44_D.evaluate1())
        assertEquals(4,brelan_R_A_777.evaluate1())
        assertEquals(5,quinte_V_9_8_10_7.evaluate1())
        assertEquals(6,couleur_1_2_4_5_6.evaluate1())
        assertEquals(7,full_222_DD.evaluate1())
        assertEquals(8,carre_AAAA_R.evaluate1())
        assertEquals(9,quinte_flush_V.evaluate1())
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