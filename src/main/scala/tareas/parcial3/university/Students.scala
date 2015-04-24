package parcial3.university
class Students{
    val students = new Array[Student](50)
    var aux: Int = 0
    var aux2: Int = 0
        def add(student:Student): Unit = {
            students(aux) = student
            aux = aux + 1
            println("\nEl Alumno se ha agregado con exito.")
        }
        def ofCareer(career: String): Array[Student] = {
            val stu = new Array[Student](50)
            var aux: Int = 0
            for (i <- 0 to students.length){
                if (students(i).career == career){
                    stu(i) = students(i)
                    aux = aux + 1
                }
            }
            return stu
        }
        def withRegistrationNumber(rg: String): Student = {
            var index: Int = 0
            for (i <- 0 to students.length){
                if (students(i).registrationNumber == rg){
                    index = i
                    aux2 = aux2 + 1 
                }
            }
            val auxStudent = students(index)
            return auxStudent
        }
        def total():Int = aux

}