class Tree<T> {
    var root: BinaryTreeNode<T>? = null
}

class BinaryTreeNode<T> {
    var data:Int = 0
    var left:BinaryTreeNode<T>? = null
    var right:BinaryTreeNode<T>? = null

    constructor(data: Int) {
        this.data = data
    }
}

fun main() {
    val tree = Tree<Int>()
    tree.root = BinaryTreeNode(5)
    tree.root?.left = BinaryTreeNode(6)
    tree.root?.right = BinaryTreeNode(3)
}