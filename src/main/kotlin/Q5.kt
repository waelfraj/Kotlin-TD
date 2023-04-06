import java.util.Scanner

fun main() {
    val n = saisie()
    val sum = sumDigits(n)
    println("La somme des chiffres de $n est $sum.")

}

fun sumDigits(n: Int): Int {
    var sum = 0
    var num = n
    while (num > 0) {
        val digit = num % 10
        sum += digit
        num /= 10
    }
    return sum
}


private fun saisie():Int{
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






//Q4
/*

*/