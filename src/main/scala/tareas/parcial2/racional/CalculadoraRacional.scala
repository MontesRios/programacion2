package parcial2.racional
object CalculadoraRacional{
    def main(args: Array[String]){
    var n = 0
    var d = 0
    var n1 = 0
    var d1 = 0
        println("= = Calculadora Racional = =")
        println("Ingrese numero racional.")
        println("Ingrese numerador:")
            n = readInt()
        println("Ingrese denominador:")
            d = readInt()
        val racional_1 = new Racional(n, d)
        println("Ingrese segundo numero racional.")
        println("Ingrese numerador:")
            n1 = readInt()
        println("Dame su denominador")
            d1 = readInt()
        val racional_2 = new Racional(n1, d1)
        println("[+] Suma:")
        val racional_3 = racional_1.suma(racional_2)
            println(racional_1.resultado () + " + " + racional_2.resultado())
            println("R = " + racional_3.resultado())
        println("[-] Resta:")
            val racional_4 = racional_1.resta(racional_2)
            println(racional_1.resultado () + " - " + racional_2.resultado())
            println("R = " + racional_4.resultado())
        println("[*] Multiplicacion:")
            val racional_5 = racional_1.multiplicacion(racional_2)
            println(racional_1.resultado () + " * " + racional_2.resultado())
            println("R = " + racional_5.resultado())
        println("[/] Division:")
            val racional_6 = racional_1.division(racional_2)
            println(racional_1.resultado () + " / " + racional_2.resultado())
        println("R = " + racional_6.resultado())
    }
}