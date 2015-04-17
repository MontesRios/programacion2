package parcial2.figura
class Circulo(r:Double) extends Figura{
  val radio = r
  var pi: Double = 3.1416
  def obtenerArea():Double = {
      this.radio*pi
  }
}