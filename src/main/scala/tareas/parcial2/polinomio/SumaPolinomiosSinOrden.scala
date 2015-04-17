package parcial2.polinomio
object SumaPolinomiosSinOrden {
  def main(args: Array[String]) {
    println("Dame el grado del primer polinomio")
    val n = readInt()
    val p1 = new Polinomio(n)
    println("Dame los datos del primer polinomio")
    capturarTermino(p1)

    println("Dame el grado del segundo polinomio")
    val m = readInt()
    val p2 = new Polinomio(m)
    println("Dame los datos del segundo polinomio")
    capturarTermino(p2)

    val resultado = p1.sumar(p2)

    println(p1.mostrar())
    println("+")
    println(p2.mostrar())
    println("El resultado es: " + resultado.mostrar())
  }

  def capturarTermino(p: Polinomio) {
    var continuar = 's'
    var coeficiente: Float = 0
    var exponente: Int = 0

    while (continuar == 's') {
      println("Dame un coeficiente ")
      coeficiente = readFloat()
      println("Dame un exponente ")
      exponente = readInt()
      p.agregarTermino(coeficiente, exponente)
      println("¿Quieres agregar otro término? (s/n)")
      continuar = readChar()
    }
  }
}