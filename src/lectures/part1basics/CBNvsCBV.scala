package lectures.part1basics

object CBNvsCBV {
  def main(args: Array[String]): Unit = {

    def callByValue(x: Long): Unit = {
      // Exact value is calculated BEFORE function call and then passed
      println("By Value: " + x)
      println("By Value: " + x)

    }

    def callByName(x: => Long): Unit = {
      // =>  Exact Value is calculated at runtime. Full expression is replaced in the function itself
      // Useful in lazy streams. => Delays the evaluation until it is used
      println("By Name: " + x)
      println("By Name: " + x)
    }

    callByValue(System.nanoTime())
    callByName(System.nanoTime())



  }

}
