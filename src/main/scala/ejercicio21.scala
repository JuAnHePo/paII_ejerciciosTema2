import scala.annotation.tailrec

object ejercicio21 {
  def invertirLista[A](lista: List[A]): List[A] = {
    @tailrec
    def go(lista: List[A], acc: List[A]): List[A] = {
      if lista.isEmpty then acc
      else
        val (listaSinUltimo, ultimoElemento) = lista.splitAt(lista.length - 1)
        go(listaSinUltimo, acc ::: ultimoElemento)
    }

    go(lista, Nil)
  }

  @main def mainInvertirLista(): Unit = {
    val lista = 1 :: 2 :: 3 :: 4 :: Nil
    println(s"La lista $lista invertida es: ${invertirLista(lista)}.")
  }
}
