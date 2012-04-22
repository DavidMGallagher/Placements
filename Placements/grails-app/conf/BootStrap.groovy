import placements.Status
class BootStrap {

    def init = { servletContext ->
    
    def status1 = new Status(code:'Applied', description:'Applicant has applied').save();
    
    def status2 = new Status(code:'Not invited for interview', 
    description:'Applicant has not been invited for an interview').save();
    
    def status3 = new Status(code:'Invited for interview', 
    description:'Applicant has been invited for an interview').save();
    
    def status4 = new Status(code:'Not offered', description:'Position not offered').save();
    
    def status5 = new Status(code:'Offered', description:'Position has been offered').save();
    
    def status6 = new Status(code:'Accepted', description:'Offer accepted').save();
    
    def status7 = new Status(code:'Rejected', description:'Offer rejected').save();
    
    }
    def destroy = {
    }
}
