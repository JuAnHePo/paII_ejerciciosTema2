import scala.annotation.tailrec

object ejercicio32 {
  def map[A,B](list: List[A], f: A => B): List[B] = {
    @tailrec
    def go(list: List[A], acc: List[B]): List[B] = {
      if list.isEmpty then acc
      else go(list.tail, acc :+ f(list.head))
    }

    go(list, Nil)
  }

  @main def mainMap(): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(map(list, _ * 2))
  }
}
