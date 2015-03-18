/**
 * @author ddcjoshuad
 */
object Euler9 {

//  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//  a^2 + b^2 = c^2
//  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//  Find the product abc.

  def main(args: Array[String]): Unit={
    (1 to 997).foreach(x => (x to 998).foreach(y => (y to 999).foreach(z => if(x + y + z == 1000 && (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))){println(x*y*z)})))
  }

}
