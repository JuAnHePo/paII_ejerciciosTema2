object ejercicio2 {
  def comprimirCadena(cadena: String): String = {
    def codificar(cadena: String, c: Char): String = {
      var cnt = 0
      for (i <- 0 until cadena.length)
        if c == cadena.charAt(i) then cnt += 1
      c.toString + cnt
    }

    val cadenaComprimida = StringBuilder("")
    for (i <- 0 until cadena.length)
      if !cadenaComprimida.contains(cadena.charAt(i)) then
        cadenaComprimida.append(codificar(cadena, cadena.charAt(i)))
    cadenaComprimida.toString()
  }

  @main def mainComprimirCadena(): Unit = {
    var cadena = "aaabcc"
    println(s"La cadena inicial es $cadena.")
    cadena = comprimirCadena(cadena)
    println(s"La cadena comprimida es $cadena.\n")
  }
}
