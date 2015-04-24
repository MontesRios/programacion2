package parcial3.university
class Note(sec:Section){
    val section = sec
    var grade :Float = 0
    def itsRating(): Boolean = {
        grade == 0
    }
    def Rate(gr: Int){
        grade = gr
    }
}