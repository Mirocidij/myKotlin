package tt1

fun main(args: Array<String>) {
    val line: String? = readLine()!!.toLowerCase()
    val list: ArrayList<Char> = ArrayList()


    for (i in 0 until line!!.length) {
        list[i] = '('
        for (j in 0 until line.length) {
            if (line[i] == line[j] && i != j) {
                list[i] = ')'
                break
            }
        }
    }

    for (char in list ) {
        print(char)
    }

}