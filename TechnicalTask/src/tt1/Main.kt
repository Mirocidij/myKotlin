package tt1

fun main(args: Array<String>) {
    val line: String? = readLine()!!.toLowerCase()
    val list: ArrayList<Char> = ArrayList()


    for (i in 0..line!!.length-1) {
        list.add('(')
        for (j in 0..line.length-1) {
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
