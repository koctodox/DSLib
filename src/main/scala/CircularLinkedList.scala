
class CircularLinkedList[T](temp: T) {

  class Node(var next: Node, var value: T = temp)

  var first: Node = new Node(null)

  def add(item: T): Boolean = {
    var result: Boolean = false
    if (first.next == null) {
      first.next = new Node(first, item)
      result = true
    } else {
      var node: Node = first.next
      while (node.next != first) {
        node = node.next
      }
      node.next = new Node(first, item)
      result = true
    }
    result
  }

  def printer(): Unit = {
    println(first)
    var node: Node = first
    while (node.next != first) {
      node = node.next
      println(node.value)
    }
  }

}
