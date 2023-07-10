object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter Number :")
    val number = scala.io.StdIn.readInt()
    primeSeq(number)
  }

  def primeSeq(n: Int, i: Int = 2): Unit = {
    if (i <= n) {
      if (isPrime(i))
        println(i)
      primeSeq(n, i + 1)
    }
  }

  def isPrime(n: Int, i: Int = 2): Boolean = {
    if (n <= 1)
      false
    else if (i * i > n)
      true
    else if (n % i == 0)
      false
    else
      isPrime(n, i + 1)
  }
}