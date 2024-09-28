fun main() {
    println("Данная программа подсчитывает кол-во всех символов вo введённой строке, выдает их в алфавитном порядке.")

        println("Введите строку, содержащую символы: ")

        val input = readln()
        try {
            val charCountMap = mutableMapOf<Char, Int>()

            for (char in input) {
                charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
            }

            println("Подсчет символов:")
            charCountMap.toSortedMap().forEach { (char, count) ->
                println("$char - $count")
            }

        } catch (e: Exception) {
            println("Oшибка: ${e.message}")
        }
        finally {
            println()
        }
    }
