import java.util.Scanner

fun main() {
    val languer = saisie(1)
    val largeur = saisie(2)
    val perim = (languer + largeur) * 2
    val air = languer * largeur
    print("le perimetre est $perim \nl'air est $air")

}

private fun saisie(i:Int): Int {
    val scanner = Scanner(System.`in`)
    var n: Int? = null
    while (n == null || n < 0 || n > 1000) {
        if  (i==1){
            print("Entrez languer entre 0 et 1000 : ")
        }
        else{
            print("Entrez largeur entre 0 et 1000 : ")
        }
        if (scanner.hasNextInt()) {
            n = scanner.nextInt()
        } else {
            scanner.next() // consomme la valeur non valide
            println("Entrez un entier valide.")
        }
    }
    return n
}