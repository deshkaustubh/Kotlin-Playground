/*

 */

fun main() {
    pattern8(5)
}

fun pattern8(lines: Int) {
    repeat(lines){
        repeat(lines - it){
            print(" ")
        }
        repeat(2 * it + 1 ){j->
            print(it + j + 1)
        }
        println()
    }
}