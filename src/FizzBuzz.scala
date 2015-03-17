/**
 * @author ddcjoshuad
 */
object FizzBuzz {
  val fizz = "fizz"
  val buzz = "buzz"

  def main(args: Array[String]): Unit ={
    val nums = (0 to 100).toList
    for {num <- nums if num % 3 == 0 || num % 5 == 0}{
      if( num % 3 == 0 && num % 5 == 0) println( num + " | " +fizz + buzz)
        else if (num % 3 == 0) println( num + " | " +fizz)
        else println( num + " | " +buzz)
    }

  }

}
