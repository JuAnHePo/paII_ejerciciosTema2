import scala.annotation.tailrec

object ejercicio29 {
  def replicate[A](list: List[A], n: Int): List[A] = {
    @tailrec
    def go(list: List[A], n: Int, acc: List[A]): List[A] = {
      if list.isEmpty then acc
      else
        val otherList = list.filter(_ != list.head)
        go(otherList, n, acc ++ List.fill(n)(list.head))
    }

    go(list, n, Nil)
  }

  @main def mainReplicate(): Unit = {
    println(replicate(List("a", "b", "c", "d"), 3))
  }
}
