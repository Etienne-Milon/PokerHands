import kotlin.random.Random

class Carte {

    val couleurs = arrayListOf(TRÈFLE, CARREAU, CŒUR, PIQUE)
    val hauteurs = arrayListOf(DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS)
    var hauteur: Pair<String, Int>
    private var couleur: String


    constructor(){
        this.couleur = couleurs[Random.nextInt(couleurs.size)]
        this.hauteur = hauteurs[Random.nextInt(hauteurs.size)]
    }

    constructor(jeu:ArrayList<Carte>) :this(){
        this.couleur = jeu[Random.nextInt(jeu.size)].couleur
        this.hauteur = jeu[Random.nextInt(jeu.size)].hauteur
    }

    constructor(couleur: String, hauteur: Pair<String,Int>) : this() {
        this.couleur = couleur
        this.hauteur = hauteur
    }

    override fun toString(): String {
        return "${hauteur.first} de $couleur"
    }

    operator fun compareTo(other: Carte): Int {
        return compareValuesBy(this, other) { it.hauteur.second }
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Carte) return false
        if (hauteur != other.hauteur) return false
        return true
    }

    override fun hashCode(): Int {
        var result = hauteur.hashCode()
        result = 31 * result + couleur.hashCode()
        return result
    }


}