package org.example

fun main(){
    printAutomorphicNumbersUpTo(100)
}

fun checkAutomorphic(num: Int): Boolean {
    var powerDigit = digitChecker(num)
    var squareofNumber = num * num
    var divisor = 1
    while (powerDigit != 0){
        powerDigit = powerDigit -1
        divisor = divisor * 10
    }
    val resultVariable = squareofNumber % divisor
    return resultVariable == num
}

fun printAutomorphicNumbersUpTo(upTo: Int) {
    for (i in 1..upTo) {
        if (checkAutomorphic(i)) {
            println("$i -> Automorphic number")
        }
    }
}

fun digitChecker(num: Int): Int {
    var digit = 0
    var number = num
    while (number != 0) {
        number = number / 10
        digit = digit + 1
    }
    return digit
}