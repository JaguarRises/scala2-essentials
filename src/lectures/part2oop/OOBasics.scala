package lectures.part2oop

object OOBasics {
  def main(args: Array[String]): Unit = {

    val person = new Person("John", 28)
    println(person)
    // println(person.age)  // will not work if val/var not added
    println(person.age)
    println(person.greet("Ram"))

  }

}

//Constructor
class Person(name: String, val age: Int)  {
  //body
  val x = 2   // val/var are fields(Can be used using .)

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name!!")

  //OverLoading
  def greet(): Unit = println(s"Hi, I am $name")

  //Multiple Constructors - using def this
  def this(name: String) = this (name,0) //Auxiliary Constructor can only call an existing/primary constructor
}

// Class parameters are not fields unless added with val/var
