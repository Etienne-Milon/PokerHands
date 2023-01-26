
    val TRÈFLE = "Trèfle"
    val CARREAU = "Carreau"
    val CŒUR = "Cœur"
    val PIQUE = "Pique"
    val DEUX = Pair("2", 2)
    val TROIS = Pair("3", 3)
    val QUATRE = Pair("4", 4)
    val CINQ = Pair("5", 5)
    val SIX = Pair("6", 6)
    val SEPT = Pair("7", 7)
    val HUIT = Pair("8", 8)
    val NEUF = Pair("9", 9)
    val DIX = Pair("10", 10)
    val VALET = Pair("Valet", 11)
    val DAME = Pair("Dame", 12)
    val ROI = Pair("Roi", 13)
    val AS = Pair("As", 14)

    class Jeu {
    val COULEURS = arrayListOf(TRÈFLE, CARREAU, CŒUR, PIQUE)
    val HAUTEURS = arrayListOf(DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS)


    fun newJeu(): ArrayList<Carte> {
        val jeu : ArrayList<Carte> = arrayListOf()
        for (couleur in COULEURS) {
            for (hauteur in HAUTEURS) {
                val carte = Carte(couleur, hauteur)
                jeu.add(carte)
            }
        }
        return jeu
    }
}


