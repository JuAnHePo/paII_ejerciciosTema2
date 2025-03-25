import scala.io.Source

object ejercicio10 {
  @main def mainScanArchivo(): Unit = {
    for (line <- Source.fromFile("ejercicio10.txt").getLines())
      println(line)
  }
}
