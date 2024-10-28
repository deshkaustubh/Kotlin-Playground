/*
Episode 4 Extended KTP course Program trying in playground
 */

fun noOfDigits(num: Int){
    var number = num
    var digit = 0
    while (number != 0 ){
        number = number / 10
        digit = digit + 1
    }
    print(digit)
}

fun main() {
    noOfDigits(12345)
}