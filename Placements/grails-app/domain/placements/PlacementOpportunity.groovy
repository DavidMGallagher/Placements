package placements

class PlacementOpportunity {

	static hasMany = [applications:Student]
	
	String jobTitle
	String companyName
	Status status

    static constraints = {
    
    companyName()
    jobTitle()
    applications()
    status()
    
    }
}
