package lectures.part1basics

object Functions {
  def main(args: Array[String]): Unit = {

    def aFunction(a: String, b: Int): String = {
      a + " " + b
    }

    println(aFunction("Hello", 19))

    def aParameterLessFunction(): Int = 42
    println(aParameterLessFunction())
    println(aParameterLessFunction) //Parameter less function can be used with just the name

    def aRepeatedFunction(aString: String, n: Int) : String = {
      if(n == 1) aString
      else aString + aRepeatedFunction(aString, n-1)
    // You need to specify the return type of recursive function always
    }

    println(aRepeatedFunction("Ram ", 108))
    // When you need Loops, use Recursion

    def aFunctionWithSideEffects(aString: String): Unit  = println(aString)

    def aBigFunction(n: Int): Int = {
      def aSmallerFunction(a: Int, b: Int): Int = a + b

      aSmallerFunction(n, n-1)    }
  }

}
