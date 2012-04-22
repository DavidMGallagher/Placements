package placements

class Student {

	static hasMany = [applications:Application]
		String name
		String courseCode
		String notes
	
    static constraints = {
    }
}
