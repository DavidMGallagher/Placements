package placements

class Application {
	static belongsTo = [student:Student, jobTitle:PlacementOpportunity, code:Status]	
	
	Date dateCreated
	Date lastUpdated

    static constraints = {
    
    student()
    jobTitle()
    code()
    dateCreated()
    lastUpdated()
    
    }
}
