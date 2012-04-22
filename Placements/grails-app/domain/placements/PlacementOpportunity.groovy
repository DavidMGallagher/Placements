package placements

class PlacementOpportunity {

	static hasMany = [applications:Application]
	
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
