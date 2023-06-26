object Main {
  def main(args: Array[String]): Unit = {
    var num1 = 20.00;
    var num2 = 3.00;

    def avg(x:Float, y:Float):Float={
      ((x+y)/2)

    }
    def round(x:Float): Float = {
      val n = BigDecimal(x)
      n.setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
    }
    println(round(avg(num1.toFloat,num2.toFloat)))

  }
}