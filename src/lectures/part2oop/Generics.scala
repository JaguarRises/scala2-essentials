package lectures.part2oop

object Generics {
  def main(args: Array[String]): Unit = {

    class MyList[+A] {
      // use the type A
      //def add(element: A) = new MyList[A] => Same question as Hard problem
      def add[B >: A](element: B): MyList[B] = ???    //HARD QUESTION
    }

    class MyMap[Key, Value]

    val listOfIntegers = new MyList[Int]
    val listOfStrings = new MyList[String]

    // traits can also have generics
    //objects can't be type parameterized
    object MyList {
      // generic methods
      def empty[A]: MyList[A] = ???
    }
    val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
    class Animal
    class Cat extends Animal
    class Dog extends Animal

    // Can List[Cat] extend List[Animal]
    // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
    class CovariantList[+A]
    val animal: Animal = new Cat
    val animalList: CovariantList[Animal] = new CovariantList[Cat]
    //animalList.add(new Dog) ??? HARD QUESTION => We return a list of Animals (Line 9)

    // 2. No = INVARIANCE
    class InvariantList[A]
    val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]  // Not InvariantList[Cat]

    // 3. Hell, NO!! = CONTRAVARIANCE
    class ContravariantList[-A]
    val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

    class Trainer[-A]
    val trainer: Trainer[Cat] = new Trainer[Animal] //much more sense

    // bounded types

    class Cage[A <: Animal](animal: A) // A can only be subtypes of Animal
    // >: Supertype

    val newCage = new Cage(new Dog)

    class Car
    val newCar = new Cage(new Car) // Not Acceptable since Car is not subtype of Animal

  }

}
