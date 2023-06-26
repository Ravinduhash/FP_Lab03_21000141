import scala.io.StdIn._
object Q2 extends App{
  def fun(arr:List[String])=arr.filter(_.length>5)
  //  var newlist = new Array[String](0)

  //  var n = readLine("Please enter no of strings: ").toInt
  //  var arr : List[String]
  //  var a=0
  //  for(a<-0 to n-1){
  //    arr = arr :: readLine("Enter string: ")
  //  }

  println(fun(List("My","name","is","ravindu","hasanka","Athukorala","hi","all")))


}
