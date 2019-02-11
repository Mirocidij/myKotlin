package tt2

fun main(args: Array<String>) {
    val list = arrayOf(0, 1, 2, 3, 4, "", 6, 7, 8, 9)
    val test = PaginationHelper(list, 2)

    println(test.getElemNumbers())
    println(test.getAllPages())
    println(test.getElemNumOnPage(3))
    println(test.getElemPageNum(4))


}