/**
 * @author ddcjoshuad
 */
object Main {

  def main(args: Array[String]): Unit ={
    val ints = "32".toCharArray.map(x => Character.getNumericValue(x))
    ints.foreach(x => println(x))
    println(ints.foldLeft(1)(_ * _))
  }

}
