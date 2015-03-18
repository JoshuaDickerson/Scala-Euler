/**
 * @author ddcjoshuad
 */
// Euler 6
object SquareSums {
//  The sum of the squares of the first ten natural numbers is,
//  1^2 + 2^2 + ... + 10^2 = 385
//  The square of the sum of the first ten natural numbers is,
//  (1 + 2 + ... + 10)^2 = 55^2 = 3025
//  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

  def main(args: Array[String]): Unit ={
    val sumSquares = (1 to 100).map(x => x*x).sum
    val squareSums = Math.pow((1 to 100).sum, 2)
    printf("%f", (squareSums - sumSquares))
  }

}
