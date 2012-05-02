package placements

class Application {
	static belongsTo = [student:Student, jobTitle:PlacementOpportunity, status:Status]	
	
	Date dateCreated
	Date lastUpdated

    static constraints = {
    
    student()
    jobTitle()
    status()
    dateCreated()
    lastUpdated()
    
    }
}
