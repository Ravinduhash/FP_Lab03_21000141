object Main {
  def main(args: Array[String]): Unit = {
    var num1 = 30;
    var num2 = 3;

    def avg(x:Int, y:Int)={
      val temp = (x+y)/2
      println(temp)
      val n = BigDecimal(1.234)
      n.setScale(2, BigDecimal.RoundingMode.HALF_UP)
    }
    println(avg(num1,num2))

  }
}