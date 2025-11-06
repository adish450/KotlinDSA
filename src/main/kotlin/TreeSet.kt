import java.util.Comparator
import java.util.TreeSet

fun main() {
    val set = TreeSet<Int>(Comparator { a, b ->
        b - a
    })

    set.add(56)
    set.add(22)
    set.add(96)
    set.add(36)
    set.add(86)

    for (i in set) {
        print("$i ")
    }

    val set1 = TreeSet<String>(Comparator { a, b ->
        a.length - b.length
    })

    val comparator = Comparator<Int> { a, b -> a - b}

    val set3 = TreeSet<String>().sortedWith ( compareBy<String> { it.length }.thenBy { it })

    val list = listOf(62,5,63,6)
        .sortedWith { a, b -> a - b }

    for (i in list) print(i)
    set1.add("adsadasd")
    set1.add("asdska")
    set1.add("asd")
    set1.add("sadsa")
    set1.add("asdsadasdasdsa")

    for (i in set1) {
        print("$i ")
    }
}