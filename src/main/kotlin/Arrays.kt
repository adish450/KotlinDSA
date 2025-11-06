fun main(args: Array<String>) {
    //arrays
    val arr1 = Array<String>(5) { i -> "${i}a" }

    for (i in 0 until arr1.size) {
        print("${arr1[i]} ")
    }

    val arr2 = arrayOf("asdsa", 'c', 45, 2.25)
    val arr3 = arrayOf<Int>(2,5,3,5,6,4,2,6)
    arr3[2] = 58

    //lists
    val arr4 = listOf<Int>(5,3,6,5,6,32,4,5,6,8)

    for(i in arr4) {
        print(i)
    }

    val arr5 = arr4.forEach { index -> index*2}
    val arr6 = arr4.forEachIndexed { index, item ->
        println("$index $item")
    }

    val arr7 = mutableListOf<Int>(4,5,6,8,7,4,5)
    arr7.add(25)
    arr7.add(0,32)

    for (i in arr7) {
        print("$i ")
    }

    //arrayLists
    val arr8 = arrayListOf(4,5,8,9)
    arr8.add(45)
    arr8.add(2,58)

    for (i in arr8) {
        print("$i ")
    }
}