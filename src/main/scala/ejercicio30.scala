import scala.annotation.tailrec

object ejercicio30 {
  def range(x: Int, y: Int): List[Int] = {
    @tailrec
    def go(x: Int, y: Int, acc: List[Int]): List[Int] = {
      if x == y then acc :+ x
      else if x < y then go(x + 1, y, acc :+ x)
      else go(x - 1, y, acc :+ x)
    }

    if x == y then Nil else go(x, y, Nil)
  }

  @main def mainRange(): Unit = {
    println(range(4, 9))
    println(range(9, 4))
    println(range(5, 5))
  }
}
