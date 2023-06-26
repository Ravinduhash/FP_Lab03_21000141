import scala.io.StdIn._

object Q1 extends App{

  def rev(a:String):String={
    if(a.length>0){
      rev(a.tail)+a.head;
    }
    else {
      ""
    }
  }
  var str = readLine("Please enter a string: ")
  var reversestr = rev(str)
  println(reversestr)
}
