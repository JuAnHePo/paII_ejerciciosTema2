object ejercicio7 {
  class Fraction( n: Int, d: Int) {
    require(d != 0, "El denominador no puede ser cero.\n")
    private val num = n / mcd(n, d)
    private val den = d / mcd(n, d)

    def this(n: Int) = this(n, 1)

    def getNum: Int = num

    def getDen: Int = den

    def +(f: Fraction): Fraction = {
      Fraction(num * f.getDen + f.getNum * den, den * f.getDen)
    }

    def +(n: Int): Fraction = {
      Fraction(num + n * den, den)
    }

    def -(f: Fraction): Fraction = {
      Fraction(num * f.getDen - f.getNum * den, den * f.getDen)
    }

    def -(n: Int): Fraction = {
      Fraction(num - n * den, den)
    }

    def *(f: Fraction): Fraction = {
      Fraction(num * f.getNum, den * f.getDen)
    }

    def *(n: Int): Fraction = {
      Fraction(num * n, den)
    }

    def /(f: Fraction): Fraction = {
      Fraction(num * f.getDen, den * f.getNum)
    }

    def /(n: Int): Fraction = {
      Fraction(num, den * n)
    }

    def mcd(a: Int, b: Int): Int = {

      def ordenar(a: Int, b: Int): (Int, Int) = {
        if a > b then (b, a) else (a, b)
      }

      val (menor, mayor) = ordenar(a.abs, b.abs)
      if menor == 0 then mayor else mcd(menor, mayor % menor)
    }

    def mcm(a: Int, b: Int): Int = {
      a * b / mcd(a, b)
    }

    def mostrar(): Unit = {
      println(s"$num/$den")
    }
  }

  @main def mainFraction(): Unit = {
    var f = Fraction(8, 4)
    f.mostrar()
    f = f.+(Fraction(2, 4))
    f.mostrar()
    f = f.-(Fraction(3, 5))
    f.mostrar()
    f = f.*(Fraction(2, 3))
    f.mostrar()
    f = f./(Fraction(5, 2))
    f.mostrar()
  }
}
