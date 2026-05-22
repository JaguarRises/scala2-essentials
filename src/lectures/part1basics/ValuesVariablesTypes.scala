package lectures.part1basics

object ValuesVariablesTypes {
  def main(args: Array[String]): Unit = {

    val x: Int = 42
    //Types of vals are optional. Compiler can infer types
    println(x)
    // VALS ARE IMMUTABLE

    val aString: String = "Hello, this is a String"; //Semicolons are optional
    //Semicolon is mandatory if writing multiple statements on the same line

    val aBoolean: Boolean = false
    val aChar: Char = 'a'
    val anInt: Int = x
    val anShort: Short = 548
    val aLong: Long = 839238293823289239L
    val aFloat: Float = 2.71f
    val aDouble: Double = 5.1469

    // Variables in Scala - var

    var aVariable: Int = 5
    aVariable = 10 // Var can be reassigned. Mutable

    //vars are used for Side-Effects
    // Functional Programming involves more of vals and less of vars


  }

}
