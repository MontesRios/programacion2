package parcial3.university
import com.github.nscala_time.time.Imports._
class Project(val careerP:String,
              val nameP:String,
              val codeP:String,
              val starDate: DateTime,
              val subsidy:Float,
              val institution:String)
              {
    //Arreglos e índices de profesores y becarios
    var researcher: Professor = null
    val professorsProject = new Array[Professor](50)
    val scholarshipsHolder = new Array[Student](50)
    var indexP: Int = 0
    var indexSH: Int = 0
    //Agregar profesor al proyecto
    def addProfessor(professor:Professor){
        professorsProject(indexP) = professor
        indexP = indexP + 1
    }
    //Agregar investigador al proyecto
    def addResearcher(professor:Professor){
        researcher = professor
    }
    //Agregar becario al proyecto
    def addScholarshipHolder(student:Student){
        scholarshipsHolder(indexSH) = student
        indexSH = indexSH + 1
    }
    def Code():String = codeP
    def Career():String = careerP
    def Professor():Array[Professor] = professorsProject
    def ScholarshipHolder(): Array[Student] = scholarshipsHolder
    def IndexProfessor(): Int = indexP
    def IndexScholarship(): Int = indexSH
    def showProject(){
        println("\nLos datos que ingreso son los siguientes:\n")
        println("\tCarrera: " + careerP)
        println("\tNombre: " + nameP)
        println("\tCodigo: " + codeP)
        println("\tFecha de Inicio: " + starDate)
        println("\tSubsidio: " + subsidy)
        println("\tInstitucion: " + institution)
        println("\tInvestigador: ")
        researcher.showProfessor()
    }
}