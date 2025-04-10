import scala.annotation.tailrec

object ejercicio27 {
  def compress[A](list: List[A]): List[A] = {
    @tailrec
    def go(list: List[A], acc: List[A]): List[A] = {
      if list.isEmpty then acc
      else if acc.isEmpty || acc.last != list.head then go(list.tail, acc :+ list.head)
      else go(list.tail, acc)
    }

    go(list, Nil)
  }

  @main def mainCompress(): Unit = {
    println(compress(List("a","a","a","b","c","c","d","a","e","e","e")))
  }

}
