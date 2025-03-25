import scala.io.StdIn.readLine
import scala.util.Try

object ejercicio9 {
  def leer(): Try[Int] = {
    print("Introduzca un número entero: ")
    Try(readLine().toInt)
  }
  @main def mainScan(): Unit = {
    var n = leer()
    while n.isFailure do
      print("Valor introducido inválido. ho")
      n = leer()
    println(s"El número introducido es: ${n.get}")
  }
}
