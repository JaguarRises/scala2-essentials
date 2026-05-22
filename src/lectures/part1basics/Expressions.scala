package lectures.part1basics

object Expressions {
  def main(args: Array[String]): Unit = {
    val x = 1 + 2 //RHS - Expressions
    println(x)

    println(2 + 3 * 4)    //>>> Right shift with zero extension

    println(1 == 3)

    println(!(1 == 2))

    var aVariable = 2
    aVariable += 3    // Works with only vars
    println(aVariable)

    //Instruction - Something you tell the computer to DO
    //Expressions - Compute a Value

    //If Expression

    val aCondition = true;

    val aConditionValue = if(aCondition) 5 else 3
    // If expression gives a value
    println(if(aCondition) 5 else 3)

    println(aConditionValue)

    var i = 0
    while(i < 5){
      println(i)
      i += 1

      //Don't write loops in scala
      //Everything in Scala is an expression

      val aWeirdValue = {aVariable = 3}   //Unit === void equivalent
      println(aWeirdValue)    //Unit only holds ()

      //Side effects in Scala are expresions returning Unit

      //Side Effects - Printing something to console - println(). while, reassigning

      //Code Block

      val aCodeBlock = {
        val y = 2
        val z = y + 1
        if (z > 2) "Hello" else "Bye"
        //Value of code block is the value of its last expression
        //here it is of type String
      }


    }
  }

}
