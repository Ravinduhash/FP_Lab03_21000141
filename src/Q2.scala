//import scala.io.StdIn._
//object Q2 extends App{
//  var newlist = new Array[String](0)
//  def func(str:String):Array[String]={
//    if(str.length>5){
//      Array(str)
//    }
//    else {
//      Array()
//    }
//  }
//
//  def func1(str:Array[String]):Array[String]={
//    if(str.length>1){
//      var newarr: Array[String] = Array.concat(func(str.head), func1(str.tail))
//    }
//    else {
//      func(str.head)
//    }
//  }
//  var n = readLine("Please enter no of strings: ").toInt
//  var arr = new List[String](n)
//  var a=0
//  for(a<-0 to n-1){
//    arr(a)= readLine("Enter string: ")
//  }
//
//
//}
