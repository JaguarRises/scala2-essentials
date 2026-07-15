package lectures.part2oop

import scala.language.postfixOps

object MethodNotations {
  def main(args: Array[String]): Unit = {

    class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
      def likes(movie: String): Boolean = movie == favoriteMovie
      //def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
      def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
      def +(nickName: String) = {
        new Person(s"${this.name} (${nickName})", favoriteMovie)
      }
      def unary_! : String = s"$name, what the heck!"
      def unary_+ : Person = new Person(this.name,this.favoriteMovie, this.age + 1)
      def isAlive: Boolean = true
      def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
      def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
      def learns(message: String): String = s"$name learns $message"
      def learnsScala()= this learns "Scala"

    }

    val mary = new Person("Mary", "Inception")
    println(mary.likes("Inception"))
    println(mary likes "Inception") //equivalent
    // infix notation = operator notation (Syntactic Sugar)
    // for single parameter function

    //Operators in scala
    val tom = new Person("Tom","Fight Club")
    //println(mary hangOutWith tom)   // function hangOutWith acts like an operator
    println(mary + tom)

    println( 1 + 2)
    println(1.+(2)) // equivalent
    // All Operators are methods
    // Akka actors have ! ?

    //Prefix Notations - Unary operators

    val x = -1 // equivalent with 1.unary_-

    println(!mary)
    println(mary.unary_!)

    //Postfix Notation (functions without parameters)
    println(mary.isAlive)
    println(mary isAlive)

    println(mary.apply())
    println(mary())  // equivalent - called the instance as a function
    // this is because of apply() method - apply is special
    println((mary.+("The Rockstar")).name)
    println((mary + "The Phoenix").name)
    println((+mary).age)
    println(tom learns "Scala")
    println(mary learnsScala)
    println(mary.apply(2))
  }

}
