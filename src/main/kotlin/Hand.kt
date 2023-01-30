class Hand {

    val cartes = ArrayList<Carte>()

    constructor() {
        val jeu = Jeu().newJeu()
        for (i in 1..5) {
            val carte = Carte(jeu)
            cartes.add(carte)
            jeu.remove(carte)
        }
    }

    constructor(vararg cartesMain: Carte) {
        for (carte in cartesMain) cartes.add(carte)
    }

    fun evaluate1(): Int {
        var appariementCpt = 0
        for (i in 0..cartes.size) {
            for (j in i + 1..cartes.size - 1) {
                if (cartes[i].equals(cartes[j]))
                    appariementCpt++
            }
        }
        when (appariementCpt) {
            1 -> return 2
            2 -> return 3
            3 -> return 4
            4 -> return 7
            6 -> return 8
            0 -> {
                if (evalQuinte() && !evalCouleur()) return 5
                if (!evalQuinte() && evalCouleur()) return 6
                if (evalQuinte() && evalCouleur()) return 9
                else return 1
            }
            else -> return 0
        }
    }

    fun evalQuinte(): Boolean {
        var sortedHand = cartes.sortedBy { it.hauteur.second }
        for (i in 1..sortedHand.size-1)
            if (sortedHand[i].hauteur.second-1 != sortedHand[i - 1].hauteur.second )
                return false
        return true
    }

    fun evalCouleur(): Boolean {
        for (i in 1..cartes.size-1)
            if (cartes[i].couleur != cartes[i - 1].couleur)
                return false
        return true
    }


    fun evaluate2(): Int {
        return when (getHighestNumberOfAKind()) {
            4 -> 8
            3 -> 5
            3 -> 4
            2 -> 3
            1 -> 2
            0 -> 1
            else -> 0
        }
        getHighestKind()
        return 0
    }

    private fun getHighestNumberOfAKind(): Int {
        return (cartes.groupingBy { it.hauteur.second }.eachCount().values.max())
    }
    private fun getSecondHighestNumberOfAKind(): Int {
        return (cartes.groupingBy { it.hauteur.second }.eachCount().values.max()-1)
    }

    private fun getHighestKind(): Int {
        val highestKind = cartes.maxBy { it.hauteur.second }.hauteur.second
        return (highestKind)
    }
    private  fun getHighestCard() : Carte{
        return cartes.maxBy { it.hauteur.second }
    }

    operator fun compareTo(other: Hand): Int {
        var nb = compareValuesBy(this, other) { it.evaluate2() }
        if (nb == 0){
            nb = compareValuesBy(this, other){it.getHighestNumberOfAKind()}
        }
        return nb
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hand) return false
        if (cartes != other.cartes) return false

        return true
    }

    override fun hashCode(): Int {
        return cartes.hashCode()
    }

    override fun toString(): String {
        val string = ""
        for (carte in cartes)
            string.plus(carte.toString()).plus(" ")
        return string
    }


}