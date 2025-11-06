fun main() {
    val map = HashMap<Int,Int>()

    map[3] = 6
    map[2] = -3
    map[5] = 3
    map[6] = 8
    map[-1] = 10

    print(map.contains(-1))

    for (key in map.keys) { // not in order
        println(map[key])
    }
}