import scala.io.Source

object ejercicio15 {
  def numeroApariciones(archivo: String): Map[String, Int] = {
    var aparicionesPalabras = Map[String, Int]()
    for (line <- Source.fromFile(archivo).getLines())
      val palabrasLinea = line.split(" ")
      for (i <- palabrasLinea.indices)
        val palabra = palabrasLinea(i)
        aparicionesPalabras += (palabra -> (aparicionesPalabras.getOrElse(palabra, 0) + 1))
    aparicionesPalabras
  }

  @main def mainNumeroApariciones(): Unit = {
    println(numeroApariciones("ejercicio15.txt").mkString("(", ", ", ")"))
  }
}
