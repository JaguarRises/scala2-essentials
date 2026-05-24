package lectures.part1basics

import scala.annotation.tailrec

object Recursion {

  def main(args: Array[String]): Unit = {

    def factN(n: Int): Int = {
      if (n <= 1) 1
      else {
        println("Computing factorial of " + n +" - I first need the factorial of " + (n-1))
        val result = n * factN(n - 1)
        println("Computed factorial of " + n)

        result

        // There is chance of StackOverflow error
      }
    }
    println(factN(5))

    def anotherFactorial(n: Int): Int = {
      @tailrec
      def factHelper(x: Int, accumulator: Int): Int = {
        if (x <= 1) accumulator
        else factHelper(x-1, x * accumulator)   //Tail Recursion - recursive call is the last expression
      }
      factHelper(n, 1)
    }

    //When you need loops, use tail recursion

    println(anotherFactorial(10))
  }
}
