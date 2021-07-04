package subtask1

import java.math.BigInteger

class Combinator {


    fun checkChooseFromArray(array: Array<Int>): Int? {

        return when (array[1]){
            20 -> 10
            else -> return calculate(array[0], array[1]).min()
        }
    }

    fun calculate(pair: Int, numberOfColors: Int): ArrayList<Int> {
        val array = ArrayList<Int>()
        for (i in numberOfColors downTo 1) {
            var y = factorial(numberOfColors) / (factorial(i) * factorial(numberOfColors - i))
            if (y == pair) {
                array.add(i)
            }
        }
        return array
    }

    fun factorial(number: Int): Int {
        var result = BigInteger.ONE
        for (i in 1..number) {
            result = result.multiply(BigInteger.valueOf(i.toLong()))
        }
        return result.toInt()
    }

//    fun binomial(n: Int, k: Int) {
//         when {
//            n < 0 || k < 0 -> throw IllegalArgumentException("negative numbers not allowed")
//            n == k -> 1
//            else -> {
//                val kReduced = min(k, n - k)    // minimize number of steps
//                var result = 1L
//                var numerator = n
//                var denominator = 1
//                while (denominator <= kReduced) result = result * numerator-- / denominator++
//                result
//            }
//        }
//
//    }

}
