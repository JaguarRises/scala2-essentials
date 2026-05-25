package exercises

object ExOOPBasics {
  def main(args: Array[String]): Unit = {

    val author = new Writer("JK", "Rowling", 1965)
    val imposter = new Writer("JK", "Rowling", 1975)
    val novel = new Novel("Harry Potter", 1997, author)

    println(novel.authorAge())
    println(novel.isWrittenBy(imposter))

    val counter = new Counter() //default is 0
    counter.incCount().print
    counter.incCount().incCount().incCount().print
    counter.incCount(10).print

  }
}

class Writer( firstName: String, lastName: String, val year: Int) {
  def fullName(): String = firstName + " " + lastName
}

class Novel(val name: String, val yearOfRelease: Int, author: Writer) {
  def authorAge():Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}

class Counter(val count: Int = 0) { // (x: Int)
  //def currentCount(): Unit = println(x) // To reunite a function that just returns a parameter

  def incCount(): Counter = { //def incCount = // No need of () with parameterless functions
    println("Incrementing")
    new Counter(count + 1) //immutability - same as val - instances are fixed.
    // Whenever you want to modify, return new instance
  }

  def decCount(): Counter = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def incCount(n: Int): Counter = {
    //new Counter (count + n)
    if (n <= 0) this
    else incCount.incCount(n-1)   //  === this.incCount.incCount(n-1)

    /*
    def incCount(n: Int): Counter = {
      if (n <= 0) this
      else {
              val incrementedCounter = this.incCount()
              incrementedCounter.incCount(n - 1)
        }
    }
    */
  }

  def decCount(n: Int): Counter = {
    //new Counter (count - n)
    if(n <= 0) this
    else decCount.decCount(n-1)
  }

  def print = println(count)
}


