object ejercicio3 {
  def caracterFrecuente(cadena: String): Char = {
    def contarApariciones(str: String, c: Char): Int = {
      var cnt = 0
      for (i <- 0 until cadena.length)
        if str.charAt(i) == c then cnt += 1
      cnt
    }

    var mayoritario = (cadena.charAt(0), contarApariciones(cadena, cadena.charAt(0)))
    for (i <- 1 until cadena.length)
      val caracterSig = cadena.charAt(i)
      val aparicionesSig = contarApariciones(cadena, caracterSig)
      if mayoritario(1) < aparicionesSig then
        mayoritario = (caracterSig, contarApariciones(cadena, caracterSig))
    mayoritario(0)
  }

  @main def mainCaracterFrecuente(): Unit = {
    val str = "aaabb11"
    println(s"El caracter que mas se repite en la cadena $str es ${caracterFrecuente(str)}.\n")
  }
}
