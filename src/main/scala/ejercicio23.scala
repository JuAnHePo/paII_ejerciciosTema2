import scala.annotation.tailrec

object ejercicio23 {
  def listaNumerosHastaN(n: Int): List[Int] = {
    require(n >= 0, "El numero debe ser mayor o igual a 0.\n")
    @tailrec
    def go(n: Int, cnt: Int, acc: List[Int]): List[Int] = {
      if n == -1 then acc
      else go(n - 1, cnt + 1, acc ::: List(cnt))
    }

    go(n, 0, Nil)
  }

  @main def mainListaNumerosHastaN(): Unit = {
    println(listaNumerosHastaN(10))
  }
}
