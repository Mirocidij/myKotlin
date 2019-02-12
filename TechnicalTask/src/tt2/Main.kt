package tt2

fun main(args: Array<String>) {
    val list = arrayOf(0, 1, 2, 3, 4, "", 6, 7, 8, 9)
    val test = PaginationHelper(list, 2)

    println("Количество элементов в массива ${test.getElemNumbers()}")
    println("Страниц в массиве ${test.getAllPages()}")
    println("Количество элементов на странице ${test.getElemNumOnPage(3)}")
    println("Элемент находится на ${test.getElemPageNum(4)} странице")


}
