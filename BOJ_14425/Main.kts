fun main() {
    val reader = System.`in`.bufferedReader()
    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val keySet = (1..n).map { reader.readLine() }.toSet()
    val valueList = (1..m).map { reader.readLine() }

    var count = 0
    valueList.forEach { value ->
        if (keySet.contains(value)) { count++ }
    }
    println(count)
}

main()