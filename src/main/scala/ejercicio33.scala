import scala.annotation.tailrec

object ejercicio33 {
  def groupBy[A,B](list: List[A], f: A => B): Map[B, List[A]] = {
    @tailrec
    def go(list: List[A], acc: Map[B, List[A]]): Map[B, List[A]] = {
      list match
        case Nil => acc
        case h :: t => go(t, acc + (f(h)->(acc.getOrElse(f(h), Nil) :+ h)))
    }
    
    go(list, Map())
  }
  
  @main def mainGroupBy(): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(groupBy(list, _ % 2 == 0))
  }
}
