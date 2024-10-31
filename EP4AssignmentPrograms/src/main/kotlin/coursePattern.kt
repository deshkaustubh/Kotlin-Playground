
/*
Episode 4 Extended KTP course Program trying in playground
 */

fun findPattern(num: Int){
    var number = num
    var digit = noOfDigits(num)
    var power = 1
    var result = 1
    var output = 0

}

fun noOfDigits(num: Int): Int{
    var digit = 0
    var number = num
    while (number != 0){
        number = number / 10
        digit = digit + 1
    }
    return digit
}


fun main() {
    findPattern(5)
}
