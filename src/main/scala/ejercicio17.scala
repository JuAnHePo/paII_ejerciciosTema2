import java.io.{File, FileInputStream, FileOutputStream, IOException}

object ejercicio17 {
  def copiarArchivo(origen: String, destino: String): Unit = {
    val archivoOrigen = File(origen)
    val archivoDestino = File(destino)
    try {
      val entrada = FileInputStream(archivoOrigen)
      val salida = FileOutputStream(archivoDestino)
      val buffer = Array[Byte](1024.toByte)
      var bytesRead = 0

      while ({bytesRead = entrada.read(buffer); bytesRead != -1}) {
        salida.write(buffer, 0, bytesRead)
      }

      entrada.close()
      salida.close()
    } catch
      case e: IOException => println("Error al copiar el archivo.")
  }

  @main def mainCopiarArchivo(): Unit = {
    copiarArchivo("ejercicio17A.txt", "ejercicio17B.txt")
  }
}
