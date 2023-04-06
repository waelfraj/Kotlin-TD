import java.util.Scanner

fun main() {
    val n1 = saisie(1)
    val n2 = saisie(2)
    val n3 = saisie(3)
    val moy = (n1 + n2 + n3) / 3
    println("La moyenne est $moy")
}

private fun saisie(i:Int): Int {
    val scanner = Scanner(System.`in`)
    var n: Int? = null
    while (n == null || n < 0 || n > 1000) {
        print("Entrez l'entier numero $i entre 0 et 1000 : ")
        if (scanner.hasNextInt()) {
            n = scanner.nextInt()
        } else {
            scanner.next() // consomme la valeur non valide
            println("Entrez un entier valide.")
        }
    }
    return n
}