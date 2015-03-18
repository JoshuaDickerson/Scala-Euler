import scala.collection.Set

/**
 * @author ddcjoshuad
 */
object Euler10 {

  def main(args: Array[String]): Unit = {
    //The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    //Find the sum of all the primes below two million.
    println(listPrimes(2000000l).sum)

  }

  def isPrime(num: Long, primes: List[Long]): Boolean ={
    primes.reverse.foreach(x => if(num % x == 0){return false})
    return true
  }

  def listPrimes(num: Long): Set[Long] ={
    var allNums = collection.mutable.Set() ++ (2l to num)
//    val mutableMap = collection.mutable.Map() ++ allNums
//    val mutableSet = collection.mutable.Set(0l)
    (2l to num).foreach(x => {
      if(x % 100 == 0){
        println(x)
      }
      var counter = 2
      while(counter * x <= num){
        allNums.remove(counter * x)
        counter += 1
      }
    })

    return allNums
  }

}
