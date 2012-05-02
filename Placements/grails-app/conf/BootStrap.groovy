import placements.Status
import placements.Student
import placements.PlacementOpportunity
import placements.Application

class BootStrap {

    def init = { servletContext ->
    
	def status1 = new Status(code:'Applied', description:'Applicant has applied').save();
    
    def status2 = new Status(code:'Not invited for interview', description:'Applicant has not been invited for an interview').save();
    
    def status3 = new Status(code:'Invited for interview', description:'Applicant has been invited for an interview').save();
    
    def status4 = new Status(code:'Not offered', description:'Position not offered').save();
    
    def status5 = new Status(code:'Offered', description:'Position has been offered').save();
    
    def status6 = new Status(code:'Accepted', description:'Offer accepted').save();
    
    def status7 = new Status(code:'Rejected', description:'Offer rejected').save();
    
    def status8 = new Status(code:'Open', description:'Application is open to applicants').save();
    
    def status9 = new Status(code:'Closed', description:'Application is closed to applicants').save();
    
    def student1 = new Student(name:'Steve Williams', courseCode:'COMP', applications:'', notes:'').save();
    
    def student2 = new Student(name:'David Roberts', courseCode:'MCOMP', applications:'', notes:'').save();
    
    def student3 = new Student(name:'Amy Hughes', courseCode:'WEB', applications:'', notes:'').save();
    
    def student4 = new Student(name:'Mohammed Imman', courseCode:'MWEB', applications:'', notes:'').save();
    
    def student5 = new Student(name:'Sarah Taylor', courseCode:'COMP', applications:'', notes:'').save();
    
    def placementOpportunity1 = new PlacementOpportunity(companyName:'ABC Design and Development', jobTitle:'Designer', status:status8).save();
    
    def placementOpportunity2 = new PlacementOpportunity(companyName:'Lloyds Telecommunication', jobTitle:'Database Administrator', status:status8).save();
    
    def placementOpportunity3 = new PlacementOpportunity(companyName:'Williams Development', jobTitle:'Programmer', status:status8).save();
    
    def placementOpportunity4 = new PlacementOpportunity(companyName:'ZYX Computing', jobTitle:'Graduate Java Developer', status:status9).save();
    
    def application1 = new Application(student:student1, jobTitle:placementOpportunity1, status:status3, dateCreated:new Date(), lastUpdated:new Date()).save();
    
	def application2 = new Application(student:student2, jobTitle:placementOpportunity2, status:status2, dateCreated:new Date(), lastUpdated:new Date()).save();
    
    def application3 = new Application(student:student3, jobTitle:placementOpportunity3, status:status1, dateCreated: new Date(), lastUpdated:new Date()).save();
    
    def application4 = new Application(student:student4, jobTitle:placementOpportunity3, status:status2, dateCreated:new Date(), lastUpdated:new Date()).save();
    
    def application5 = new Application(student:student5, jobTitle:placementOpportunity1, status:status7, dateCreated:new Date(), lastUpdated:new Date()).save();
    
    }
    def destroy = {
    }
}
