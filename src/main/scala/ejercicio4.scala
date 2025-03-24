object ejercicio4 {
  class bankAccount {
    private var saldo = 0

    def depositarDinero(cantidad: Int): Unit = {
      require(cantidad > 0, "Cantidad a depositar inválida.\n")
      saldo += cantidad
    }

    def retirarDinero(cantidad: Int): Unit = {
      require(cantidad > 0 && cantidad <= saldo, "Cantidad a retirar inválida.\n")
      saldo -= cantidad
    }

    def verificarSaldo(): Unit = println(s"El saldo de la cuenta bancaria es $saldo.")
  }

  @main def mainBankAccount(): Unit = {
    val cuenta = bankAccount()
    cuenta.verificarSaldo()
    cuenta.depositarDinero(100)
    cuenta.verificarSaldo()
    cuenta.retirarDinero(50)
    cuenta.verificarSaldo()
  }
}
