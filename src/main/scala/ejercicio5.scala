object ejercicio5 {

  class Triangle(var l1: Double, var l2: Double, var l3: Double) {
    def clasificarPorLados(): Unit = {
      if l1 == l2 && l1 == l3 then
        println("El triángulo es equilátero.")
      else if l1 == l2 && l1 != l3 then
        println("El triángulo es isósceles.")
      else
        println("El triángulo es escaleno.")
    }
  }

  @main def mainComprobarTriangulo(): Unit = {
    val t = Triangle(1, 1, 1)
    t.clasificarPorLados()
  }
}
