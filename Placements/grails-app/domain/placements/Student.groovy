package placements

class Student {

	static hasMany = [applications:Application]
		String courseCode
		String name
		String notes
	
    static constraints = {
    
    	name()
    	courseCode()
    	applications()
    	notes()
    
    }
}
