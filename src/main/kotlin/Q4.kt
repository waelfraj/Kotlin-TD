fun main() {
    val arr = intArrayOf(1, 2, 9, 4)
    val max = findMax(arr)
    println("Le maximum est $max")
}

fun findMax(arr: IntArray?): Int {
    if (arr == null || arr.isEmpty()) {
        return -1
    }
    var max = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }
    return max
}