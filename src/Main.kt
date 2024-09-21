fun main() {
    println("Данная программа подсчитывает кол-во всех символов вo введённой строке, выдает их в алфавитном порядке.\n")
    while (true) {
        println("Введите строку, содержащую символы или введите 'exit' для выхода: ")

        val input = readln()

        if (input.equals("exit", ignoreCase = true)) {
            println("Программа завершена.")
            break
        }

        if (input.isEmpty()) {
            println("Ошибка: пустая строка:( (введите строку, содержащую хотя бы один символ)")
            println()
            continue
        }

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
}