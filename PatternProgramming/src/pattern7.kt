/*
Qsn 19 of pdf
*******
*** ***
**   **
*     *
**   **
*** ***
*******
 */


fun main(){
    patter7Final(7)
}

fun pattern7(lines: Int){
    var newVariable = lines / 2
    repeat(newVariable){
        repeat(newVariable - it){
            print("*")
        }
        repeat(2 * it + 1){
            print(" ")
        }
        repeat(newVariable - it){
            print("*")
        }
        println()
    }
    // Reverse Pattern
    repeat(newVariable -1){
        repeat(it + 2){
            print("*")
        }
        repeat(newVariable - (2 * it)){
            print(" ")
        }
        repeat(it + 2){
            print("*")
        }
        println()
    }
}

fun patter7Final(lines: Int){
    repeat(lines){
        print("*")
    }
    println()
    pattern7(lines)
    repeat(lines){
        print("*")
    }
}