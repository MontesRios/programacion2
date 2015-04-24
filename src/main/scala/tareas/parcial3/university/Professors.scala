package parcial3.university
class Professors{
    val professors = new Array[Professor](20)
    private var aux: Int = 0
    private var aux2: Int = 0
        def add(professor:Professor){
            professors(aux) = professor
            aux = aux + 1
            println("\nEl Profesor se ha agregado con exito")
        }
        def ofCareer(career:String): Array[Professor] = {
            var profs = new Array[Professor](20)
                for (i <- 0 to professors.length){
                    if (professors(i).career == career){
                        profs(i) = professors(i)                        
                        aux2 = aux2 + 1
                    }
                }
          profs
        } 
        def total():Int = aux
        def totalOfCareer():Int = aux2
}
        