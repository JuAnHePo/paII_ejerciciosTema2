import scala.io.Source

object ejercicio16 {
  def palabraMasLongeva(archivo: String): String = {
    var palabraMasLongeva = ""
    for (line <- Source.fromFile(archivo).getLines())
      val palabrasLinea = line.split(" ")
      for (i <- palabrasLinea.indices)
        val palabra = palabrasLinea(i)
        if palabra.length > palabraMasLongeva.length then palabraMasLongeva = palabra
    palabraMasLongeva
  }

  @main def mainPalabraMasLongeva(): Unit = {
    println(s"La palabra más longeva del texto es: ${palabraMasLongeva("ejercicio16.txt")}.")
  }
}
