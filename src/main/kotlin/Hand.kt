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
        return evaluateMultiples()
    }

    fun evaluate2(): String{
        //getHighestNumberOfAKind(cartes)
        return getHighestKind(cartes)
    }

    private fun getHighestNumberOfAKind(cartes: ArrayList<Carte>): Int {
        return (cartes.groupingBy { it.hauteur.second }.eachCount().values.max())
    }

    private fun getHighestKind(carte: ArrayList<Carte>):String{
        //val highestnumber = cartes.groupingBy { it.hauteur.second }.eachCount().values.max()
        val highestKind = cartes.maxBy { it.hauteur.second }.hauteur.first
        return(highestKind)
    }

    operator fun compareTo(other: Hand): Int {
        return compareValuesBy(this, other) { it.hauteur.second ; it.hauteur.second }
    }



    private fun evaluateMultiples(): Int {
        var points = 0
        var carteHaute:Carte
        for (i in 0..cartes.size) {
            for (j in i + 1..cartes.size-1) {
                if (cartes[i].equals(cartes[j])) {
                    points++
                }
                if (cartes[i].hauteur.second < cartes[j].hauteur.second)
                    carteHaute = cartes[j]
            }
        }
        when (points){
            6 -> return 8
            4 -> return 7
            3 -> return 4
            2 -> return 3
            1 -> return 2
            0 -> return 1
            else -> return 0
        }
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
        val string =""
        for (carte in cartes)
            string.plus(carte.toString()).plus(" ")
        return string
    }


}