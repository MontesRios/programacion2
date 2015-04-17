package parcial2.figura
object FiguraArea{
  def main(args:Array[String]){
    var opcion:Int = 0
    var area:Double = 0.0
    println("\nPrograma que calcula el area de un circulo o un rectangulo.\n")
    println("Que figura desea escojer:")
    println("1.Circulo\t2.Rectangulo")
        opcion = readInt()
            if(opcion == 1){
                println("\nIngrese el radio del circulo:\n")
                    var radio = readDouble()
                    val circulo = new Circulo(radio)
                    area=circulo.obtenerArea()
                println("\nEl area del circulo es:" + area)
            }else if(opcion == 2){
                println("\nIngrese la altura del rectangulo:")
                    var altura = readDouble()
                println("\nIngrese la base del rectangulo:")
                    var base = readDouble()
                    val rectangulo = new Rectangulo(altura,base)
                    var area = rectangulo.obtenerArea()
                println("\nEl area del rectangulo es " + area)
    }
  }
}