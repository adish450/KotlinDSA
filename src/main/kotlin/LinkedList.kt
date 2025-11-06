import java.util.LinkedList

fun main(args: Array<String>) {
    val list = LinkedList<Int>() //DLL

    list.addFirst(23)
    list.addFirst(52)
    list.addFirst(63)
    list.addFirst(26)
    list.addLast(86)
    list.addLast(66)
    list.addLast(22)

    list.removeFirst()
    list.removeFirst()
    list.removeFirst()
    list.removeLast()
    list.removeLast()


    for (i in list) {
        print("$i ")
    }

    val itr = list.iterator()
    while (itr.hasNext()) {
        print("${itr.next()} ")
    }
}