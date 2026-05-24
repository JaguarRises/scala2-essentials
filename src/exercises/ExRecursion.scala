package exercises

import scala.annotation.tailrec

object ExRecursion {

  def main(args: Array[String]): Unit = {

    // Accumulators need to have the same return type as the function return type
    def concatenateString(aString: String, n: Int): String = {
      if (n == 1) aString
      else aString + " " + concatenateString(aString, n - 1)
    }

    println(concatenateString("Ram", 5))

    def concatenateTailRec(aString: String, n: Int): String = {
      @tailrec
      def helperFunction(n: Int, accumulator: String): String = {
        if(n <= 0) accumulator
        else helperFunction(n-1, aString + accumulator)
      }
      helperFunction(n, " ")
    }
    println(concatenateTailRec("Ram ", 5))

    def isPrimeTailRec(n: Int): Boolean = {
      if(n < 2) false
      else if(n == 2) true
      else if(n % 2 == 0) false
      else{
        @tailrec
        def isPrimeUntil(div: Int): Boolean = {
          if (div * div > n) true
          else if (n % div == 0) false
          else isPrimeUntil(div + 2)
        }
        isPrimeUntil(3)
      }
    }

    println(isPrimeTailRec(29))

    def fiboNTailRec(n: Int): Int = {
      @tailrec
      def calcFiboHelper(a: Int, b: Int, count: Int): Int = {
        //var sum = a + b
        if(count == 0) a
        else calcFiboHelper(b, a + b, count -1)
      }
      calcFiboHelper(0, 1, n)

    }
    println(fiboNTailRec(10))


  }

}