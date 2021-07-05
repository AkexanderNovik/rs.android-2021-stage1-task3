package subtask2

class SquareDecomposer {

    var result = arrayListOf<Int>()


    fun decomposeNumber(number: Int): Array<Int>? {
        return if (number <5 ){
            null
        } else {
            decompose(number.toLong())
            result.toTypedArray()
        }
    }

    private fun decompose(n: Long): ArrayList<Int> {
        for (i in n - 1 downTo 2) {
            val square = n * n
            result = recurseDecompose(i, square)!!
            if (result != null) break
        }
        return result
    }


    private fun recurseDecompose(i: Long, rem: Long): ArrayList<Int>? {
        var x = rem
        if (i * i == x) {
            result.add(i.toInt())
            return result
        } else if (i * i < x) {
            x = x - i * i
            for (j in i - 1 downTo 1) {
                val tmp = recurseDecompose(j, x)
                return if (tmp != null) {
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
