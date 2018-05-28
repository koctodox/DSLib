
case class LinkedList[T]() {

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

  def deleteByItem(item: T): Boolean = {
    var result: Boolean = false
    var beforeLast = first
    var last = first.next
    if (first.value == item) {
      first = last
      result = true
    }
    while (last != null && !result) {
      if (last.value == item) {
        beforeLast.next = last.next
        result = true
      }
      beforeLast = last
      last = last.next
    }
    result
  }

  def deleteByIndex(index: Int): Boolean = {
    var result: Boolean = false
    var last: Node = first.next
    var beforeLast: Node = first
    var count: Int = 1
    if (index == 0) {
      first = last
      result = true
    }
    while (last != null && !result) {
      if (index == count) {
        beforeLast.next = last.next
        result = true
      }
      count += 1
      beforeLast = last
      last = last.next
    }
    result
  }

  def getByIndex(index: Int): Option[T] = {
    var result: Option[T] = None
    var last: Node = first.next
    var count: Int = 1
    if (index == 0) {
      result = Some(first.value)
    }
    while (last != null) {
      if (index == count) {
        result = Some(last.value)
      }
      count += 1
      last = last.next
    }
    result
  }

  def indexOf(item: T): Int = {
    var result: Int = -1
    var count: Int = 1
    var last: Node = first.next
    if (first.value == item) {
      result = count - 1
    }
    while (last != null) {
      if (last.value == item) {
        result = count
      }
      last = last.next
      count += 1
    }
    result
  }

  def exists(item: T): Boolean = {
    indexOf(item) match {
      case -1 => false
      case _ => true
    }
  }

  def reverse(): LinkedList[T] = {
    val newLinkedList: LinkedList[T] = LinkedList()

    def initializer(last: Node): LinkedList[T] = {
      if (last.next != null) {
        initializer(last.next)
      }
      newLinkedList.add(last.value)
      newLinkedList
    }

    initializer(first)
  }

  def updateByIndex(index: Int, newItem: T): Boolean = {
    var result: Boolean = false
    var last = first.next
    var count = 1
    if (index == 0) {
      first.value = newItem
      result = true
    }
    while (last != null) { // TODO : KIAN J please fix other condition like this.
      if (index == count) {
        last.value = newItem
        result = true
      }

      last = last.next
      count += 1
    }
    result
  }

  def updateByItem(previosItem: T, newItem: T): Boolean = {
    updateByIndex(indexOf(previosItem), newItem)
  }

  //    def sort()

  //    distinct()

}
