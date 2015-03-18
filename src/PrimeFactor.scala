/**
 * @author ddcjoshuad
 */
// Eurler 3
object PrimeFactor {
  //What is the largest prime factor of the number 600851475143 ?
  // 6857
  def main(args: Array[String]): Unit ={
    var max = 1l
    var counter = 1l
    var num = 600851475143l
    while (counter < num){
      if(counter % 2 != 0 && num % counter == 0 && isPrime(counter)){
        max = counter
        println(max)
      }
      counter += 1
    }
    println(max)
  }


  def isPrime(num: Long): Boolean ={
    var test = 2l
    while(test < num){
      if(num % test == 0){
        return false
      }
      test += 1
    }
    return true
  }


  /// see http://daily-scala.blogspot.com/2010/01/streams-2-stream-construction.html
  // to make more functional

}
