import java.util.PriorityQueue

fun main() {
    val pq = PriorityQueue<Int> { a, b -> b - a }

    pq.add(5)
    pq.add(8)
    pq.add(2)
    pq.add(10)
    pq.add(15)

    while (!pq.isEmpty()) println(pq.poll())
}