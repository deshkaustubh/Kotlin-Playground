

//fun main(){
//    patter5Final(7)
//}
//
//fun pattern5(lines: Int){
//    val newVariable = ( lines + 1) / 2
//    repeat(newVariable){
//        repeat(newVariable - it){
//            print(" ")
//        }
//        repeat(2 * it + 1){
//            print("*")
//        }
//        repeat(newVariable - it){
//            print(" ")
//        }
//        println()
//    }
//    // Reverse Pattern
//    val revVar = newVariable - 1
//    repeat(revVar){
//        repeat(it + 2){
//            print(" ")
//        }
//        repeat(2 * (revVar - (it + 1)) + 1){
//            print("*")
//        }
//        println()
//    }
//}
//
//fun patter5Final(lines: Int){
//    if (lines / 2 == 0 || lines == 1){
//        print("This pattern works only for odd number of lines starting from 3")
//    }
//    else {
//        pattern5(lines)
//    }
//}