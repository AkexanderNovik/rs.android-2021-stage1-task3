package subtask3

class TelephoneFinder {

    private val result = mutableSetOf<String>()

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        return if (number.toInt()>0){
            for (i in number.indices) {
                changeToNeighbor(number,i)
            }
            println(result)
            result.toTypedArray()
        } else{
            null
        }
    }

    private fun changeToNeighbor(s: String, index: Int){
        val strBf = StringBuffer(s)
        when (strBf[index]){
            '1' -> {
                strBf.setCharAt(index,'2')
                result.add(strBf.toString())
                strBf.setCharAt(index,'4')
            }
            '2' -> {
                strBf.setCharAt(index,'1')
                result.add(strBf.toString())
                strBf.setCharAt(index,'3')
                result.add(strBf.toString())
                strBf.setCharAt(index,'5')
                result.add(strBf.toString())
            }
            '3' -> {
                strBf.setCharAt(index,'2')
                result.add(strBf.toString())
                strBf.setCharAt(index,'6')
                result.add(strBf.toString())
            }
            '4' -> {
                strBf.setCharAt(index,'1')
                result.add(strBf.toString())
                strBf.setCharAt(index,'5')
                result.add(strBf.toString())
                strBf.setCharAt(index,'7')
                result.add(strBf.toString())
            }
            '5' -> {
                strBf.setCharAt(index,'2')
                result.add(strBf.toString())
                strBf.setCharAt(index,'4')
                result.add(strBf.toString())
                strBf.setCharAt(index,'6')
                result.add(strBf.toString())
                strBf.setCharAt(index,'8')
                result.add(strBf.toString())
            }
            '6' -> {
                strBf.setCharAt(index,'3')
                result.add(strBf.toString())
                strBf.setCharAt(index,'5')
                result.add(strBf.toString())
                strBf.setCharAt(index,'9')
                result.add(strBf.toString())
            }
            '7' -> {
                strBf.setCharAt(index,'4')
                result.add(strBf.toString())
                strBf.setCharAt(index,'8')
                result.add(strBf.toString())
            }
            '8' -> {
                strBf.setCharAt(index,'5')
                result.add(strBf.toString())
                strBf.setCharAt(index,'7')
                result.add(strBf.toString())
                strBf.setCharAt(index,'9')
                result.add(strBf.toString())
                strBf.setCharAt(index,'0')
                result.add(strBf.toString())
            }
            '9' -> {
                strBf.setCharAt(index,'6')
                result.add(strBf.toString())
                strBf.setCharAt(index,'8')
                result.add(strBf.toString())
            }
            '0' -> {
                strBf.setCharAt(index,'8')
                result.add(strBf.toString())
            }
        }
    }
}
