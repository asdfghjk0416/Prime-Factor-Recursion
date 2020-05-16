package functions
object Algebra{
  def factor(number:Int):List[Int]={
    if (number>=2) {
//    if (number<2) {
//     List()
//    }else{
      for(i <- 2 to number)
      if(number %i ==0){
         return List(i):::factor(number/i).sorted
        }
    }
    //      for(i <-3 to number ) {
//        while(number % i == 0){
//          List(factor(2), factor(1),factor(i))
//        }
      List()
      }



def main (args: Array[String] ): Unit = {
  println(factor(12))
  println(factor(2))
  println(factor(-12))
  println(factor(1))
  println(factor(100))
}

}
