import java.util.LinkedList
import java.util.Queue
import java.util.Stack

fun main(args: Array<String>) {

    //stacks
    val stack1 = Stack<Int>()
    stack1.push(5)
    stack1.push(6)
    stack1.push(8)
    stack1.push(1)
    stack1.push(0)
    stack1.push(-2)

    while (!stack1.isEmpty()) {
        println(stack1.pop())
    }

    println("============================================================================")

    val stack2 = LinkedList<Int>()
    stack2.push(2)
    stack2.push(5)
    stack2.push(-55)
    stack2.push(54)
    stack2.push(78)
    stack2.push(22)
    stack2.push(89)

    while (!stack2.isEmpty()) {
        println(stack2.pop())
    }

    println("============================================================================")

    //queue(interface)
    val queue1: Queue<Int> = LinkedList<Int>()

    queue1.add(5)
    queue1.add(6)
    queue1.add(8)
    queue1.add(9)
    queue1.add(2)
    queue1.add(-2)

    while (!queue1.isEmpty()) {
        println(queue1.remove())
    }

    println("============================================================================")

    //Deque (doubly ended queue)
    val stack3 = ArrayDeque<Int>()

    stack3.addLast(5)
    stack3.addLast(10)
    stack3.addLast(55)
    stack3.addLast(51)
    stack3.addLast(58)
    stack3.addLast(85)
    stack3.addLast(52)
    stack3.addLast(59)
    stack3.addLast(15)

    while (!stack3.isEmpty()) {
        println(stack3.removeLast())
    }

    println("============================================================================")

    val stack4 = ArrayDeque<Int>()

    stack4.addLast(5)
    stack4.addLast(10)
    stack4.addLast(55)
    stack4.addLast(51)
    stack4.addLast(58)
    stack4.addLast(85)
    stack4.addLast(52)
    stack4.addLast(59)
    stack4.addLast(15)

    while (!stack4.isEmpty()) {
        println(stack4.removeFirst())
    }

    println("============================================================================")

}