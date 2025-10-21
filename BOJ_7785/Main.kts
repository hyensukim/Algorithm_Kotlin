fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()

    val companySet = hashSetOf<String>()
    repeat(n) {
        val (company, action) = reader.readLine().split(" ")
        if(action == "enter") companySet.add(company)
        else companySet.remove(company)
    }

    companySet.sortedDescending().joinToString("\n").also{ println(it) }
}

main()