object Q4 {
  def main(args: Array[String]): Unit = {
    print("Enter Number :")
    val number = scala.io.StdIn.readInt()
    val isEven = isEvennum(number)
    if (isEven)
      println("Even")
    else
      println("Odd")
  }

  def isEvennum(n : Int): Boolean = {
    if (n == 0)
      true
    else if (n == 1)
      false
    else
      isEvennum(n-2)
}
}