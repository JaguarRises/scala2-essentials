package exercises

import scala.annotation.tailrec

object ExFunctions {

  def main(args: Array[String]): Unit = {

    def aGreetingFunction(name: String, age: Int): Unit = {
      println("Hello my name is " + name + " and I am " + age + " years old")
      println(s"Hello my name is $name and I am $age years old")
    }

    aGreetingFunction("Prerit", 28)

    def factorialOfN(n: Int): Int = {
      if(n <= 1) 1
      else n * factorialOfN(n-1)
    }

    println(factorialOfN(5))

    def fiboN(n: Int): Int = {
      @tailrec
      def calcFibo(a: Int, b: Int, count: Int): Int = {
        //var sum = a + b
        if(count == 0) a
        else calcFibo(b, a + b, count -1)
      }
      calcFibo(0, 1, n)

    }
    println(fiboN(8))

    def isPrime(n: Int): Boolean = {
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

    println(isPrime(2))
    println(isPrime(1))
    println(isPrime(17))
    println(isPrime(91))
    println(isPrime(97))


  }

}
