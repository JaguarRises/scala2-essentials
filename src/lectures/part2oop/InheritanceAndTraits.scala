package lectures.part2oop

object InheritanceAndTraits {
  def main(args: Array[String]): Unit = {

    class Animal {

      val creatureType = "Wild"
      //private def eat(): Unit = println("Eating")
      //protected def eat(): Unit = println("Eating")
      def eat(): Unit = println("Eating")

    }

    class Cat extends Animal {
      def crunch(): Unit = {
        eat()
        println("Crunch")
      }
    }

    val cat = new Cat
    cat.crunch()

    // Constructor - parameterized class
    class Person(name: String, age: Int) {
      def this(name: String) = this(name, 0)    //extends Person(name) is also valid
    }
    class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
    // Parameter must be given in the super class while extending, if the super class has parameters
    // Parent class constructor called first

    class Dog extends Animal {
      override val creatureType: String = "Domestic"
      override def eat(): Unit = println("Inside, Dog")
    }

    val dog = new Dog
    dog.eat()
    println(dog.creatureType)
    //Fields can be directly overridden in the constructor unlike methods

    //type substitution(broad: Polymorphism)
    val unknownAnimal: Animal = new Dog
    unknownAnimal.eat()

    // super

    //preventing override:
    // 1 - use final on field
    // 2 - use final on the entire class
    // 3 - sealed - classes can be inherited in the same file but not outside the file
  }

}