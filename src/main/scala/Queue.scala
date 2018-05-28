case class Queue[T]() {

  case class Node(var next: Node, var value: T)

  var first: Node = _

  def add(item: T): Unit = {
    val node = Node(null, item)
    if (first == null) {
      first = node
    } else {
      var last = first
      while (last.next != null) {
        last = last.next
      }
      last.next = node
    }
  }

  def drop: T= {
    val result = first.value
    first = first.next
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

/*
*   val queue: Queue[Int] = Queue()

  queue.add(1)
  queue.add(2)
  queue.add(3)
  println(queue.drop + " dropped")
  queue.add(4)
  queue.add(5)

  queue.printAll()

  println(queue.drop + " dropped")
  println(queue.drop + " dropped")

  queue.printAll()
* */
