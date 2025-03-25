import scala.annotation.tailrec
import scala.math.pow

object ejercicio12 {
  def sumaDigitos(n: Int): Int = {
    def go(n: Int, nDig: Int): Int = {
      if n == 0 then 0
      else n / nDig + go(n % nDig, nDig / 10)
    }

    go(n, contarDigitos(n))
  }

  def sumaDigitosColaRecursiva(n: Int): Int = {
    @tailrec
    def go(n: Int , nDig: Int, acc: Int): Int = {
      if n == 0 then acc
      else go(n % nDig, nDig / 10, acc + n / nDig)
    }

    go(n, contarDigitos(n), 0)
  }

  def contarDigitos(n: Int): Int = pow(10, n.toString.length).toInt

  @main def mainSumaDigitos(): Unit = {
    println(sumaDigitos(569))
    println(sumaDigitosColaRecursiva(9))
  }
}
