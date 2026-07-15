package exercises

abstract class MyListGeneric[+A] {

  def head: A
  def tail: MyListGeneric[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyListGeneric[B]
  def printElements: String

  //Polymorphic Call
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyListGeneric {
  def head: Int = throw new NoSuchElementException
  def tail: MyListGeneric = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyListGeneric = new Cons(element, Empty)
  def printElements: String = ""
}

class Cons(h: Int, t: MyListGeneric) extends MyListGeneric {
  def head: Int = h
  def tail: MyListGeneric = t
  def isEmpty: Boolean = false
  def add(element: Int): MyListGeneric = new Cons(element, this)
  def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object ListTest {
  def main(args: Array[String]): Unit = {
    val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
    println(list.head)
    println(list.add(4).head)
    println(list.toString)
  }
}