import scala.annotation.tailrec

object ejercicio28 {
  def pack[A](list: List[A]): List[List[A]] = {
    @tailrec
    def go(list: List[A], acc: List[List[A]]): List[List[A]] = {
      if list.isEmpty then acc
      else
        val otherList = list.filter(_ != list.head)
        val headList = list.filter(_ == list.head)
        go(otherList, acc :+ headList)
    }

    go(list, Nil)
  }

  @main def mainPack(): Unit = {
    println(pack(List("a","a","a","b","c","c","d","e","e","e")))
  }
}
