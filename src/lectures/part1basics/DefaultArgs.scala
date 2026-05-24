package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs {
  def main(args: Array[String]): Unit = {

    def factOfN(num: Int): Int = {
      @tailrec
      def factorialHelper(x: Int, accumulator: Int = 1): Int = {

        if(x <= 1) accumulator
        else factorialHelper(x - 1, accumulator * x)

      }
      factorialHelper(num)  // Default value of accumulator is one
      // For Default values, all the parameters on the right of that parameter must also have default values
      // Or Name the arguments
      // factorialHelper(accumulator = 1, x = 10) // Order doesn't matter when naming the parameters
    }

    println(factOfN(6))

  }

}
