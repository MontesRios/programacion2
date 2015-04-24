package parcial3.university
import com.github.nscala_time.time.Imports._
class Professor(val nameP: String,
                val socialSecurityNumberP: String, 
                val addressP: String, 
                val sexP: Char, 
                val dateOfBirthP: DateTime,
                val careerP: String,
                val category: String,
                val officeNumber:Int,
                val extension :Int,
                val pay:Float,
                var dept: Department = null)extends Person(nameP,socialSecurityNumberP,addressP,sexP,dateOfBirthP,careerP)
{
    def showProfessor(){
        println("\nLos datos que ingreso son los siguientes:\n")
        println("\tNombre: " + nameP)
        println("\tNumero del Seguro Social: " + socialSecurityNumberP)
        println("\tDireccion: " + addressP)
        println("\tSexo: " + sexP)
        println("\tFecha de Nacimiento: " + dateOfBirthP)
        println("\tCarrera: " + careerP)
        println("\tCategoria: " + category)
        println("\tDespacho: " + officeNumber)
        println("\tExtension: " + extension)
        println("\tSalario: " + pay + "\n")
    }
    def Name() : String = nameP
}//EndClass