package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }
  //anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Haha")
  }
  println(funnyAnimal.getClass)

  /*
  equivalent with
  * class AnonymousClasses$$anon$1 extends Animal{
  * override def eat: Unit = println("Haha")
  * }

  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
  *
  * */

  // Anonymous Class works for both abstract and non-abstract
}
