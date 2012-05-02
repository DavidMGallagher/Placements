package placements

class ApplyController {

    def index() { }
    
    def processApplication() {
        log.debug(params.studentName)
    	log.debug(params.placementOpportunityJobTitle)
   	
    	 def student_find_object = Student.findByName(params.studentName);
    	 
    	 def placementOpportunity_find_object = PlacementOpportunity.findByJobTitle(params.placementOpportunityJobTitle);
    	 
    	 def foundStatus = Status.findByCode("Applied")
    	 
    	 def newApplication = new Application(student:student_find_object, status:foundStatus, jobTitle:placementOpportunity_find_object, dateCreated:new Date(), lastUpdated:new Date()).save()
    	 
    	 redirect(action:'index')
		}
	}
