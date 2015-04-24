package parcial3.university
class Subject (val name: String, 
               val code: Int, 
               val description: String, 
               val department: Department,
               val career: String)
{   
    def Career():String = career
    def Name():String = name
}//End Subject