package EP4Assignment3

/*
3.3 Automorphic Numbers
 Check if a number is an automorphic number, which is a number whose square ends in the
same digits as the number itself. For example, 25 is an automorphic number because (25^2 =
625).
 */

fun main(){
    println(checkAutomorphic(5))
}

fun checkAutomorphic(num: Int): Boolean{ // Here interestingly I took help of print reverse number program
    var number = num
    //while(number != 0){
        val numend = number % 10
    //}
    var squareofNumber = num * num
    //while(squareofNumber != 0){
        val squarenumend = squareofNumber % 10
    //}
    if (numend == squarenumend) return true else return false
}
