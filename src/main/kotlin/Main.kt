import java.util.Scanner

fun main() {
    ////////////////////////////////////////////
    //Q1:
    //var n = saisie()
    // val fact: Long = factorial(n)
    // println("$n! = $fact")
    ////////////////////////////////////////////
    //Q2:
    // var n1 = saisie()
    // var n2 = saisie()
    // var n3 = saisie()
    // var moy = (n1 + n2 + n3) / 3
    // println("La moyenne est $moy")
    ////////////////////////////////////////////
    //Q3 :
    val languer = saisie()
    val largeur = saisie()
        val perim = (languer + largeur) * 2
        val air = languer * largeur
        print("le perimetre est $perim \nl'air est $air")

}
fun saisie():Int{
    val scanner = Scanner(System.`in`)
    var n: Int? = null
    while (n == null) {
        print("Entrez un entier : ")
        if (scanner.hasNextInt()) {
            n = scanner.nextInt()
        } else {
            scanner.next() // consomme la valeur non valide
            println("Entrez un entier valide.")

        }
    }
    return 0
}



//Q1:
/*
fun factorial(n: Int): Long {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}
*/