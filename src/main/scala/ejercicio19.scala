object ejercicio19 {
  def nth[A](lista: List[A], pos: Int): Option[A] = {
    lista(pos) match
      case Nil => None
      case _ => Option(lista(pos))
  }

  @main def mainNth(): Unit = {
    val lista = 1 :: 2 :: 3 :: 4 :: Nil
    val listaVacia = Nil
    try {
      println(nth(lista, 2))
      println(nth(listaVacia, 0))
    } catch
      case e: NoSuchElementException => println(None)
      case e: IndexOutOfBoundsException => println(None)
  }
}
