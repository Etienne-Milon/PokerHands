fun main(args: Array<String>) {

//    val carte1 = Carte()
//    println(carte1)
//    val carte2 = Carte()
//    println(carte2)
//    println(carte1.compareTo(carte1))
    //println(Hand().tirageMain())

//    println(Hand().cartes)
    println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(TRÈFLE,DEUX),Carte(TRÈFLE,ROI)).cartes)
    //println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(TRÈFLE,DEUX),Carte(TRÈFLE,ROI)).evaluate1())
    println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(TRÈFLE,DEUX),Carte(TRÈFLE,ROI)).evaluate2())
    println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(CARREAU,ROI),Carte(TRÈFLE,ROI)).cartes)
    //println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(CARREAU,ROI),Carte(TRÈFLE,ROI)).evaluate1())
    println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,DEUX),Carte(CARREAU,ROI),Carte(TRÈFLE,ROI)).evaluate2())

    println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,QUATRE),Carte(TRÈFLE,QUATRE),Carte(TRÈFLE,ROI)).cartes)
    println(Hand(Carte(CŒUR,DEUX),Carte(PIQUE,DEUX),Carte(CARREAU,QUATRE),Carte(TRÈFLE,QUATRE),Carte(TRÈFLE,ROI)).evaluate2())

}



