object ejercicio24 {
  def unzip[A,B](lista: List[(A, B)]): (List[A], List[B]) = {
    def go(lista: List[(A, B)]): (List[A], List[B]) = {
      if lista.isEmpty then (Nil, Nil)
      else
        val headInt = lista.head(0)
        val headChar = lista.head(1)
        (List(headInt) ::: go(lista.tail)(0), List(headChar) ::: go(lista.tail)(1))
    }

    go(lista)
  }

  @main def mainUnzip(): Unit = {
    val lista = (10, 'a') :: (20, 'b') :: (30, 'c') :: Nil
    val listaInt = unzip(lista)(0)
    val listaChar = unzip(lista)(1)
    println(s"$listaInt | $listaChar")
  }
}
