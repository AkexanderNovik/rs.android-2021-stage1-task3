package subtask3

class TelephoneFinder {

    private val result = mutableSetOf<String>()

    private val combinations = mapOf(
        "0" to "8",
        "1" to "24",
        "2" to "135",
        "3" to "26",
        "4" to "157",
        "5" to "2468",
        "6" to "359",
        "7" to "48",
        "8" to "5790",
        "9" to "68"
    )

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        return if (number.toInt() >= 0) {
            number.indices.forEach { i ->
                combinations["${number[i]}"]?.forEach { j ->
                    result += number.take(i) + j + number.drop(i + 1)
                }
            }
            result.toTypedArray()
        } else {
            null
        }
    }
}
