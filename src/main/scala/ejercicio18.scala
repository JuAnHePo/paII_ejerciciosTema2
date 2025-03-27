object ejercicio18 {
  def last[A](lista: List[A]): Option[A] = {
    lista.last match
      case Nil => None
      case _ => Option(lista.last)
  }

  @main def mainLast(): Unit = {
    val lista = 1 :: 2 :: 3 :: 4 :: Nil
    val listaVacia = Nil
    try {
      println(last(lista).get)
      println(last(listaVacia).get)
    } catch
      case e: NoSuchElementException => println("Error. La lista está vacía.")
  }
}
