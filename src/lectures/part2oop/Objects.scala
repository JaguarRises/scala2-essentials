package lectures.part2oop

object Objects {
  // Scala Application = scala object with 
  def main(args: Array[String]): Unit = {

    //public static final int = // to define constants

    //Scala doesn't have class level functionality. It doesn't have static

    object Person { //type + only instance
      //Static or Class Level functionality
      // Java - static variables are called using class name
      val N_EYES = 2
      def canFly: Boolean = false

      // factory method - sole purpose is to construct another Person from some parameters
      // def from(mother: Person, father: Person): Person = new Person("Bobbie")
      def apply(mother: Person, father: Person): Person = new Person("Bobbie")
    }
    // companion class
    class Person(val name: String) {
      //Instance - level functionality.
    }

    println(Person.N_EYES)
    println(Person.canFly)

    //Scala object is a singleton instance

    val mary = new Person("Mary")
    val john = new Person("John")
    println(mary == john)   //true - pointing to the same Person object

    // But if mary = new Person and john = new Person. Then they are not equal - Instance level functionality.
    // without "new"

    val person1 = Person   //calls the object
    val person2 = Person
    println(person1 == person2)

    // val bobbie = Person.from(mary, john)
    val bobbie = Person(mary, john) // ~ as Person.apply()
  }

}
