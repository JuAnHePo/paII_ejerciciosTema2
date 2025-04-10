object ejercicio26 {
  def flatten[A](list: List[A]): List[A] = {
    list match
      case Nil => Nil
      case (h: List[A]) :: t => flatten(h) ::: flatten(t)
      case h :: t => h :: flatten(t)
  }

  @main def mainFlatten(): Unit = {
    println(flatten(List("a", List("b", "c"), List("d", "e"))))
    println(flatten(List("a", List("b","c",List("d", "e")))))
  }
}
