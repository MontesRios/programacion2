package parcial3.university
class Projects{
    private var index: Int = 0
    private var aux: Int = 0
    val projects = new Array[Project](20)
    def add(project:Project) {
        aux = aux + 1
        projects(aux) = project
    }
    def withCode(code:String):Project = {
        for (i <- 0 to projects.length){
            if (projects(i).Code() == code){
                index = 1
            }
        }
     val projectCode = projects(index)
    projectCode
    }
    def totalProjects():Int = aux
    
    
}