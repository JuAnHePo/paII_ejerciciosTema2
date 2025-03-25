import scala.annotation.tailrec

object ejercicio11 {
  def fibonacci(n: Int): Int = {
    def go(n: Int): Int = {
      n match
        case 0 => 0
        case 1 => 1
        case _ => go(n - 1) + go(n - 2)
    }

    require(n >= 0)
    go(n)
  }

  def fibonacciTailRec(n: Int): Int = {
    @tailrec
    def go(n: Int, a: Int, b: Int): Int = {
      if n == 1 then b
      else go(n - 1, b, a + b)
    }

    require(n >= 0)
    go(n, 0, 1)
  }

  @main def mainFibonacci(): Unit = {
    println(fibonacci(8))
    println(fibonacciTailRec(8))
  }
}
