object ejercicio8 {
  class Book(title: String, author: String, yearPublished: Int) {

    def getTitle: String = title

    def getAuthor: String = author

    def getYearPublished: Int = yearPublished

    def antiguedad(b: Book): Book = {
      if yearPublished < b.getYearPublished then this else b
    }

    def mostrar(): String = {
      s"($title, $author, $yearPublished)"
    }
  }

  @main def mainBook(): Unit = {
    val b1 = Book("1984", "George Orwell", 1949)
    val b2 = Book("Farenheit 451", "Ray Bradbury", 1953)
    println(s"Entre ${b1.getTitle} y ${b2.getTitle} el más antiguo es: ${b1.antiguedad(b2).mostrar()}")
  }
}
