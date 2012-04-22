package placements

class PlacementOpportunity {
	static hasMany = [applications:Application]
	
	String jobTitle
	String companyName
	String status

    static constraints = {
    }
}
