import scala.annotation.tailrec

object ejercicio13 {
  def conjuntoSubconjuntos[A](conj: Set[A]): Set[Set[A]] = {
    def go(conj: Set[A]): Set[Set[A]] = {
      if conj.isEmpty then Set(Set())
      else
        go(conj.tail) ++ go(conj.tail).map(_ + conj.head)
    }

    go(conj)
  }

  def conjuntoSubconjuntosColaRecursiva[A](conjunto: Set[A]): Set[Set[A]] = {
    @tailrec
    def go(conjunto: Set[A], acc: Set[Set[A]]): Set[Set[A]] = {
      if conjunto.isEmpty then acc
      else
        go(conjunto.tail, acc ++ acc.map(_ + conjunto.head))
    }

    go(conjunto, Set(Set()))
  }

  @main def mainConjuntoSubconjuntos(): Unit = {
    val conj = Set(1, 2, 3, 4)
    println(conjuntoSubconjuntos(conj))
    println(conjuntoSubconjuntosColaRecursiva(conj))
  }
}
