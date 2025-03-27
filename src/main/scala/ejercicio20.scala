import scala.annotation.tailrec

object ejercicio20 {
  def sumaCuadrados(lista: List[Int]): Int = {
    @tailrec
    def go(lista: List[Int], acc: Int): Int = {
      if lista.isEmpty then acc
      else go(lista.tail, acc + lista.head)
    }

    go(lista, 0)
  }

  @main def mainSumaCuadrados(): Unit = {
    val lista = 1 :: 2 :: 3 :: 4 :: Nil
    println(s"La suma de los elementos de la lista $lista es: ${sumaCuadrados(lista)}.")
  }
}
