case class Tree[T]()(implicit ev$1: T => Ordered[T]) {

  case class Node(var left: Node, var value: T, var right: Node)

  var root: Node = _

  def add(data: T): Unit = {
    val toBeAdd: Node = Node(null, data, null)
    if (root == null) {
      root = toBeAdd
    } else {
      def addTo(data: T = data, node: Node = root): Unit = {
        if (data < node.value) {
          if (node.left == null) {
            node.left = toBeAdd
          } else {
            addTo(data, node.left)
          }
        } else if (data > node.value) {
            if (node.right == null) {
              node.right = toBeAdd
            } else {
              addTo(data, node.right)
            }
        } else {
          Unit
        }
      }
      addTo(data, root)
    }
  }

  def printAll(): Unit = {
    if (root == null)
      println(s"your tree is empty!")

    def printValues(node: Node = root): Unit = {
      if (node.left != null) {
        printValues(node.left)
      }
      println(node.value)
      if (node.right != null) {
        printValues(node.right)
      }
    }
    printValues()
  }

}
