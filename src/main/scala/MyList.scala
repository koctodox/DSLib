//import com.sun.media.jfxmedia.events.BufferListener
//
//import scala.collection.mutable._
//
//trait LinkedList[T] {
//  var list: ListBuffer[T]
//}
//
//case class MyList() extends LinkedList[String] {
//
//  override var list: ListBuffer[String] = ListBuffer()
//
//  def insertRight(item: String): Unit = list +: item //TODO: Check for work correct!
//
//  def insertLeft(item: String): Unit = list :+ item
//
//  def delete(item: String): Unit = list -= item
//
//  def distinct(): Unit = list.distinct
//
//  def update(oldItem: String, newItem: String): Unit = list.update(list.indexOf(oldItem), newItem)
//
//  def size(): Int = list.size
//
//  def incrementalInsertion(item: String): Unit = {
//    list map { elem =>
//      if(elem >= item){elem}
//    }
//    ???
//  }
//
//  //TODO : > write binary search
//  //TODO : > what is binary search "BigO" ??
//  //TODO : > what is LinierSearchBigO and what is indexOf method BigO??
//  //TODO : > what is indexOf method BigO??
//  //go to scala site and get information about speed of Scala collection function.
//  //  def binarySearch(item: String): Int = {
//  //    size match {
//  //      case 0 => ???
//  //      case _ => ???
//  //    }
//  //  }
//
//
//  def printList(): Unit = println(list)
//}
