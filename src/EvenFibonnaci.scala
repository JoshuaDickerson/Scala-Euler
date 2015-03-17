/**
 * @author ddcjoshuad
 */

// euler2
object EvenFibonnaci {
  def main(args: Array[String]): Unit = {
    val res = fibb(0,1,List(0l)).filter(x => x % 2 ==0).reduce({(x,r) => x + r})
    println(res)
  }

  def fibb(arg1: Long, arg2: Long, arg3: List[Long]): List[Long] ={
    val sum = arg1 + arg2
    val newList = sum :: arg3
    if(sum <= 4000000){
      fibb(arg2, sum, newList)
    }else{
      arg3
    }
  }
}

//4613732
