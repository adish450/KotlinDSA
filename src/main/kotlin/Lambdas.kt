fun main() {
    fun html(block: (Int, Int) -> Int) {
        println("<html>")
        println(block(5,2))
        println("</html>")
    }

    html { a, b ->
        println("Hello from lambda")
        a + b
    }
}