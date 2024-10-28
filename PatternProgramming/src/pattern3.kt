/*
Question 15 of pdf
*****
  ****
    ***
      **
        *
      **
    ***
  ****
*****
 */

fun main() {
    pattern3(5)
}

fun pattern3(lines: Int) {
    repeat(lines){
        repeat(it * 2){
            print(" ")
        }
        repeat(lines - it ){
            print("*")
        }
        println()
    }
    ulta = lines -1
    repeat(ulta){
        repeat(it + 1 ){
            print(" ")
        }
        repeat(it + 2){
            print("*")
        }
        println()
    }
}
