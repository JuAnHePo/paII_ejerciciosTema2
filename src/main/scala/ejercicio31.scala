import scala.annotation.tailrec

object ejercicio31 {
  def filter[A](list: List[A], f: A => Boolean): List[A] = {
    @tailrec
    def go(list: List[A], acc: List[A]): List[A] = {
      if list.isEmpty then acc
      else go(list.tail, if f(list.head) then acc :+ list.head else acc)
    }

    go(list, Nil)
  }

  @main def mainFilter(): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filter(list, _ % 2 == 0))
    println(filter(list, _ % 2 != 0))
    println(filter(list, _ == 11))
  }
}
