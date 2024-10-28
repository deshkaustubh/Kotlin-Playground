/*
Question 19 of pdf
   *
  ***
 *****
*******
 *****
  ***
   *
 */

fun main() {
    pattern5(4)
}

fun pattern5(lines: Int) {
    repeat(lines){
        repeat(lines - it - 1 ){print(" ")}
        repeat(2 * it + 1) {
            print("*")
        }
        println()
    }
    val reverse = lines - 1
    repeat(reverse){
        repeat(it + 1){
            print(" ")
        }
        repeat(reverse + 2 - (2 * it)){
            print("*")
        }
        println()
    }// NOTE: I have created this program, This also works properly but also I have identified a issue
}
