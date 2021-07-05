package subtask3

class TelephoneFinder {

    private val result = mutableSetOf<String>()

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        return if (number.toInt() >= 0) {
            for (i in number.indices) {
                changeToNeighbor(number, i)
            }
            result.toTypedArray()
        } else {
            null
        }
    }

    private fun changeToNeighbor(s: String, index: Int) {
        val strBf = StringBuffer(s)
        when (strBf[index]) {
            '1' -> {
                alterStringBuffer(strBf, index, '2')
                alterStringBuffer(strBf, index, '4')
            }
            '2' -> {
                alterStringBuffer(strBf, index, '1')
                alterStringBuffer(strBf, index, '3')
                alterStringBuffer(strBf, index, '5')
            }
            '3' -> {
                alterStringBuffer(strBf, index, '2')
                alterStringBuffer(strBf, index, '6')
            }
            '4' -> {
                alterStringBuffer(strBf, index, '1')
                alterStringBuffer(strBf, index, '5')
                alterStringBuffer(strBf, index, '7')
            }
            '5' -> {
                alterStringBuffer(strBf, index, '2')
                alterStringBuffer(strBf, index, '4')
                alterStringBuffer(strBf, index, '6')
                alterStringBuffer(strBf, index, '8')
            }
            '6' -> {
                alterStringBuffer(strBf, index, '3')
                alterStringBuffer(strBf, index, '5')
                alterStringBuffer(strBf, index, '9')
            }
            '7' -> {
                alterStringBuffer(strBf, index, '4')
                alterStringBuffer(strBf, index, '8')
                strBf.setCharAt(index, '4')
            }
            '8' -> {
                alterStringBuffer(strBf, index, '5')
                alterStringBuffer(strBf, index, '7')
                alterStringBuffer(strBf, index, '9')
                alterStringBuffer(strBf, index, '0')
            }
            '9' -> {
                alterStringBuffer(strBf, index, '6')
                alterStringBuffer(strBf, index, '8')
            }
            '0' -> alterStringBuffer(strBf, index, '8')
        }
    }

    private fun alterStringBuffer(strBf: StringBuffer, index: Int, char: Char) {
        strBf.setCharAt(index, char)
        result.add(strBf.toString())
    }
}
