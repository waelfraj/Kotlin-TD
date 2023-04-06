import java.util.Scanner

fun main() {
    val n = saisie()
    val fact: Long = factorial(n)
    println("$n! = $fact")
}

private fun saisie(): Int {
    val scanner = Scanner(System.`in`)
    var n: Int? = null
    while (n == null || n < 0 || n > 1000) {
        print("Entrez un entier entre 0 et 1000 : ")
        if (scanner.hasNextInt()) {
            n = scanner.nextInt()
        } else {
            scanner.next() // consomme la valeur non valide
            println("Entrez un entier valide.")
        }
    }
    return n
}
fun factorial(n: Int): Long {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}
