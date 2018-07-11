import scala.io.StdIn._

object Main extends App {
  println("Project Started !!!")
//  println("Please insert your items:")
//  println("At the end press Q:")
//  var isQ: Boolean = true
  //  val myList: MyList  = MyList()
  //  while(isQ) {
  //    val item: String = readLine()
  //________________________your Code!_______________________


  val linkedList: LinkedList[Int] = LinkedList()

  linkedList.add(1)
  linkedList.add(2)
  linkedList.add(3)
  linkedList.add(4)
  linkedList.add(5)

  linkedList.printAll()

  val a: Option[Int] = linkedList.getByIndex(2)
  println(a)


  //__________________________End!___________________________
  //    if (item == "Q") {
  //      isQ = false
  //    }
  //  }

  //  myList.printList()
}
