package parcial3.university
class Sections{
    val sections = new Array[Section](40)
    private var aux: Int = 0
    private var aux2: Int = 0
    def add(section:Section) {
        sections(aux) = section
        aux = aux + 1
    } 
    def total():Int = aux
    def coincideWith(career:String,fourMonthPeriod:String,year:Int): Array[Section] = 
    {
        val sect = new Array[Section](40)
        for (i <- 0 to sections.length){
            if (sections(i).career == career){
                if(sections(i).fourMonthPeriod(i) == fourMonthPeriod){
                    if (sections(i).year == year){
                        sect(i) = sections(i)
                        aux2 = aux2 + 1
                    }
                }
            }
        }
    sect
    }//EndCoincideWith
    def  totalCoincideWith():Int = aux2
}//End Sections
                 