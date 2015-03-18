/**
 * @author ddcjoshuad
 */
object Euler7 {
//  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//  What is the 10 001st prime number?
  def main(args: Array[String]): Unit ={
    var primes = List(2,1)
    val pStream = Stream.from (3, 2) takeWhile {x => if(isPrime(x)){ println(primes.size); primes = x :: primes }; primes.size < 10002}
    val i = pStream.toList
    println(primes(primes.size - 1))
    println(primes(0))
  }

  def isPrime(num: Long): Boolean ={
//    println(num)
    var test = 3l
    while(test < num){
      if(num % test == 0){
        return false
      }
      test += 2
    }
    return true
  }

}
