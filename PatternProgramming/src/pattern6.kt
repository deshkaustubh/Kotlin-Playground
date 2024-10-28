/*
Question 19 of pdf
   *
  *  *
 *    *
*      *
 *    *
  *  *
   *
 */

fun main() {
    pattern6(4)
}

fun pattern6(lines: Int) {
    repeat(lines) {
        repeat(lines - it - 1) {
            print(" ")
        }
        print("*")
        repeat(2 * it){
            print(" ")
        }
        if(it == 0) print("") else print("*")
        println()
    }
    val reverse = lines - 1
    repeat(reverse){
        repeat(it + 1){
            print(" ")
        }
        print("*")
        repeat(reverse - it - 1){
            print("  ")
        }
        if(reverse == it + 1) print(" ") else print("*")
        println()
    }
}
