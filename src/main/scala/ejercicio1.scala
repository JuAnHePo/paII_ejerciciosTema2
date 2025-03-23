object ejercicio1 {
  def sonPermutaciones(a: Array[Array[Int]], b: Array[Array[Int]]): Boolean = {
    a.flatten.sorted sameElements b.flatten.sorted
  }

  @main def mainSonPermutaciones(): Unit = {
    val a = Array(Array(1, 2, 3), Array(4, 5, 6))
    val b = Array(Array(4, 3, 6), Array(1, 5, 2))
    if sonPermutaciones(a, b) then
      println("SI son permutaciones.\n")
    else
      println("NO son permutaciones.\n")
  }
}
