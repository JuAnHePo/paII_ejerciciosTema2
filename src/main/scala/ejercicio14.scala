object ejercicio14 {
  def subsecuenciaCrecienteMasLongeva(lista: List[Int]): List[Int] = {
    var subsec = List[Int]()
    var aux = List[Int]()
    for (i <- lista.indices)
      if subsec.isEmpty && aux.isEmpty then
        aux = aux ::: List(lista(i))
      else if lista(i) == aux.last + 1 then
        aux = aux ::: List(lista(i))
      else if subsec.length < aux.length then
        subsec = aux
        aux = List(lista(i))
      else
        aux = List(lista(i))
    if subsec.length < aux.length then subsec = aux
    subsec
  }

  @main def mainSubsecuenciaCrecienteMasLongeva(): Unit = {
    val lista = List(1,2,3,4,7,8,10,11,12)
    println(subsecuenciaCrecienteMasLongeva(lista))
  }
}
