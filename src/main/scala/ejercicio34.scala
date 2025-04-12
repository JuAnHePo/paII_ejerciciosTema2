object ejercicio34 {
  def reduce[A](list: List[A], f: (A, A) => A): A = {
    list match
      case Nil => throw new Exception("Lista vacía.\n")
      case h :: Nil => h
      case h :: t => f(h, reduce(t, f))
  }

  @main def mainReduce(): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(reduce(list, _ + _))
    println(reduce(list, _ * _))
  }
}
