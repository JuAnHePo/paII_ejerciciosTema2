object ejercicio25 {
  def zip[A,B](listaA: List[A], listaB: List[B]): List[(A, B)] = {
    def go(listaA: List[A], listaB: List[B]): List[(A,B)] = {
      if listaA.isEmpty || listaB.isEmpty then Nil
      else List((listaA.head, listaB.head)) ::: go(listaA.tail, listaB.tail)
    }

    go(listaA, listaB)
  }

  @main def mainZip(): Unit = {
    val listaA = List(10, 20, 30)
    val listaB = List('a', 'b')
    println(zip(listaA, listaB))
  }
}
