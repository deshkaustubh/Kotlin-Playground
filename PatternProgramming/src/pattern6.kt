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

/*
Notice that the * in first and last line is not in center.

Also, you are interpreting lines wrongly. When lines = 7, pattern should contain exactly 7 lines.
Note that this pattern supports only odd number of lines starting from 3.
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
