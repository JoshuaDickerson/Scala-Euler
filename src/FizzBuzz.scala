/**
 * @author ddcjoshuad
 */

// euler 1
object FizzBuzz {
  val fizz = "fizz"
  val buzz = "buzz"

  def main(args: Array[String]): Unit ={
    val result = (0 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).sum
    println(result)
  }

}
