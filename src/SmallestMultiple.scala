/**
 * @author ddcjoshuad
 */
object SmallestMultiple {
//  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

  def main(args: Array[String]): Unit = {
    var counter = 20
    while(counter <= 2000000000){
      if(isDivisible(counter)){
        println(counter)
        counter = 2000000000
      }
      counter += 20
      println("--" +counter)
    }
  }

  def isDivisible(arg: Int): Boolean ={
    (1 to 20).foreach(x => if(arg % x != 0){ return false })
    return true
  }


}
