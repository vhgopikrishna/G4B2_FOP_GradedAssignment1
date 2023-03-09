package gl.GradedAssignment1;

public class AdminDepartment extends SuperDepartment{

	public String departmentName(){
		//System.out.println("");
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		//System.out.println("");
		return "Complete documents Submission";
	}
	
	public String getWorkDeadline() {
		//System.out.println("");
		return "Complete by EOD";
	}
}
