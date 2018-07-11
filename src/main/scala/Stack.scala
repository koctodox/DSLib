case class Stack[T]() {

  case class Node(var next: Node, var value: T)

  var first: Node = _
  var last: Node = _

  def add(item: T): Unit = {
    val node = Node(null, item)
    if (first == null) {
      first = node
      last = first
    } else {
      last.next = node
      last = last.next
    }
  }

  def get(): Option[T] = {
    var result: Option[T] = None
    if (first == null) {
      println(s"Stack is empty!")
      result = None
    } else if (first.next == null) {
      result = Some(first.value)
      first = null
    } else {
      var last: Node = first
      var before: Node = null
      while (last.next != null) {
        before = last
        last = last.next
      }
      result = Some(last.value)
      before.next = null
    }
    result
  }

  def printAll(): Unit = {
    if (first != null) {
      println(first.value)
      var last = first.next
      while (last != null) {
        println(last.value)
        last = last.next
      }
    } else {
      println("The List is empty!")
    }
  }
}
