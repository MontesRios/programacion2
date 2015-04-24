package parcial3.university
class academicHistory{
    val notes = new Array[Note](20)
    private var aux: Int = 0
    private var index: Int = 0
    def add(note:Note) {
        notes(aux) = note
        aux = aux + 1
    }
    def notesUnrated(): Array[Note] = 
    { 
        val noteUnrated = new Array[Note](20)
        
        for (i <- 0 to notes.length){
            if(!notes(i).itsRating()){
                noteUnrated(i) = notes(i)
                index = index + 1
            }//End if
        }//End for
        noteUnrated
    }//End notesUnrated
    def totalIndex():Int = index
    def showNotes(){
    for (i <- 0 to notes.length){
    println(notes)
    }
        
    }
}