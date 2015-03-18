/**
 * @author ddcjoshuad
 */
// Euler 4
object PalindromicProduct {
//  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//  Find the largest palindrome made from the product of two 3-digit numbers.
// 906609
  def main(args: Array[String]): Unit ={
    var max = 0
    (100 until 1000).foreach(x => (100 until 1000).foreach(y => if(isPalin(x * y) && (x*y) > max){ max = x * y }))
    println(max)
  }

  def isPalin(arg: Int): Boolean = {
    val str = arg.toString
    if(str.length % 2 == 0){
      val pivot = str.length / 2
      (0 to pivot).foreach(x => if(!str(x).equals(str(str.length - 1 - x))){ return false })
    }else{
      val pivot = str.length / 2 + 1
      (0 until pivot).foreach(x => if(!str(x).equals(str(str.length - 1 - x))){ return false })
    }
    return true
  }
}
