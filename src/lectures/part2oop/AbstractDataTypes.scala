package lectures.part2oop

object AbstractDataTypes {
  def main(args: Array[String]): Unit = {

    // abstract -  don't provide values
    // abstract can't be instantiated

    abstract class Animal {
      val creatureType: String
      def eat(): Unit
    }

    class Dog extends Animal {
      override val creatureType: String = "Canine"
      override def eat(): Unit = println("Eating")  //override for this is unnecessary
    }


    //traits
    trait Carnivore {
      def eat(animal: Animal): Unit
      // traits are abstract but can be inherited
    }

    trait ColdBlooded

    class Crocodile extends Animal with Carnivore with ColdBlooded {
      override val creatureType: String = "Croc"

      override def eat(): Unit = println("Crocodile, Eating")

      override def eat(animal: Animal): Unit = println(s"I'm a Croc and I'm eating ${animal.creatureType}")

    }

    // traits vs abstract classes
    // Both can have abstract and non-abstract methods
    // 1 - traits don't have constructor parameters
    // 2 - multiple traits may be inherited by the same class
    // 3 - traits = behavior, abstract class = type of thing
  }

  //Any <- AnyRef (eg java.lang.Object) <- Null
  //Any <- AnyVal (Int, Unit, Boolean, Float, e.t.c)  Derived from everything is Nothing

}
