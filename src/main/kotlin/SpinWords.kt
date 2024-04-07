package br.com.newwess.codewars


class SpinWords {

    fun spinWords(sentence: String?) : String {
        val result = StringBuilder()

        sentence?.let {
            if(sentence.isNotEmpty()) {
                val words = sentence.trim().split(" ")

                if(words.isNotEmpty()) {
                    words.forEach {
                        if(it.isNotBlank()) {
                            val okStr = it.trim()
                            if(okStr.length > 4) {
                                result.append(okStr.reversed()).append(" ")
                            } else {
                                result.append(okStr).append(" ")
                            }
                        }
                    }
                }
            }
        }

        return result.toString().trim()
    }
}