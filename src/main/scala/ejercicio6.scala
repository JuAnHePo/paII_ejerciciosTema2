object ejercicio6 {
  class Student(var name: String, var age: Int, var grades: Array[Int]) {
    def getName: String = name

    def getAge: Int = age

    def getGrades: Array[Int] = grades

    def media(): Double = {
      var media = 0
      var cnt = 0
      for (i <- 0 until grades.length)
        media += grades(i)
        cnt += 1
      media / cnt
    }
  }

  @main def mainStudent(): Unit = {
    val student = Student("Jose", 19, Array(3, 5, 8, 4, 10, 10))
    println(s"La media del estudiante " +
      s"(${student.getName}, " +
      s"${student.getAge}, " +
      s"${student.getGrades.mkString("Notas(", ", ", ")")}) " +
      s"es: ${student.media()}.")
  }
}
