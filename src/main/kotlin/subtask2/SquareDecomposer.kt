package subtask2

class SquareDecomposer {

    var result = arrayListOf<Int>()


    fun decomposeNumber(number: Int): Array<Int>? {
        if (number <5 ){
            return null
        } else {
        decompose(number.toLong())
        return result.toTypedArray()
        }
    }

    fun decompose(n: Long): ArrayList<Int> {
        for (i in n - 1 downTo 2) {
            val square = n * n
            result = recurseDecompose(i, square)!!
            if (result != null) break
        }

        println(result)
//        println(result.toIntArray())
        return result
    }


    fun recurseDecompose(i: Long, rem: Long): ArrayList<Int>? {
        var x = rem
//        var result = mutableListOf<Int>()
        if (i * i == x) {
            result.add(i.toInt())
            return result
//            return i.toString() + ""
        } else if (i * i < x) {
            x = x - i * i
            for (j in i - 1 downTo 1) {
                val tmp = recurseDecompose(j, x)
                return if (tmp != null) {

//                    println("$tmp $i")
//                    "$tmp $i"
                    result.add(i.toInt())
                    result
                } else {
                    continue
                }
            }
        } else {
            return null
        }
        return null
    }
}
