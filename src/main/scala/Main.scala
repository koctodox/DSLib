import scala.io.StdIn._

object Main extends App {


  //TODO : Test for LinkedList
  println("Please insert your items:")
  println("At the end press Q:")
  var isQ: Boolean = true
  //  val myList: MyList  = MyList()
  //  while(isQ) {
  //    val item: String = readLine()
  //________________________your Code!_______________________


  var linkedList: LinkedList[Int] = LinkedList()

  linkedList.add(1)
  linkedList.add(2)
  linkedList.add(3)
  linkedList.add(4)
  linkedList.add(12)
  linkedList.add(17)

  linkedList.printAll

  println("before delete by item: ")
  println()
  println(linkedList.getByIndex(5))
  println()
  linkedList.printAll()


  //___________________________End!____________________
  //    if (item == "Q") {
  //      isQ = false
  //    }
  //  }

  //  myList.printList()
}
