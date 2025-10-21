fun main(){
    val reader = System.`in`.bufferedReader()
    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val monsterIndexMap = hashMapOf<Int, String>()
    val monsterNameMap = hashMapOf<String, Int>()
    (1..n).forEach { i ->
        val name = reader.readLine()
        monsterIndexMap[i] = name
        monsterNameMap[name] = i
    }

    val result = buildString {
        (1..m).forEach { _ ->
            val problem = reader.readLine()
            if (problem.matches(Regex("\\d+"))) {
                append(monsterIndexMap[problem.toInt()] + "\n")
            } else {
                append(monsterNameMap[problem]?.toString() + "\n")
            }
        }
    }

    println(result)
}

main()