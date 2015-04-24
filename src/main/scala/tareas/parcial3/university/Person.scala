package parcial3.university
import com.github.nscala_time.time.Imports._
class Person(val name: String,
             val socialSecurityNumber: String,
             val address: String,
             val sex: Char,
             val dateOfBirth: DateTime,
             val career:String)
{
    def Career(): String = career
}//End class Person