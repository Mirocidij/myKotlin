package tt2


class PaginationHelper(_data: Array<Any>, _elemOnPage: Int) {
    private val data: Array<Any> = _data
    private val elemOnPage: Int = _elemOnPage

    //return number of elements in data array
    fun getElemNumbers(): Int {
        return data.size
    }

    //return number of pages in data array
    fun getAllPages(): Int {
        return (Math.ceil(getElemNumbers().toDouble() / elemOnPage)).toInt()
    }

    //return number of elements on the page
    fun getElemNumOnPage(pageNumber: Int): Int {
        var n = 0;
        if (pageNumber < getAllPages() && pageNumber >= 0) {
            if (getAllPages() == pageNumber) {
                n = data.size - pageNumber * elemOnPage
            } else if (getAllPages() > pageNumber) {
                n = elemOnPage;
            }
        }
        return n;
    }

    //return index of page, where there is element
    fun getElemPageNum(index: Int):Int {
        return (Math.ceil(index.toDouble() / elemOnPage)).toInt()
    }


}