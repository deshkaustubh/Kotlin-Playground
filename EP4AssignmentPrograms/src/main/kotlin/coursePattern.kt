
/*
Episode 4 Extended KTP course Program trying in playground
 */

fun getDigitsPowerSum(num: Int): Int {
    var number = num
    var result = 0
    var powercount = 1

    while (number != 0) {
        val digit = number % 10
        result += Math.pow(digit.toDouble(), powercount.toDouble()).toInt()
        number /= 10
        powercount = powercount + 1
    }
    return result
}

fun main() {
    println(getDigitsPowerSum(123))
}
