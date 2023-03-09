package gl.GradedAssignment1;

public class HRDepartment extends SuperDepartment{
	
	public String departmentName(){
		//System.out.println("");
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		//System.out.println("");
		return "Fill today's timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		//System.out.println("");
		return "Complete by EOD";
	}
	
	public String doActivity() {
		//System.out.println("");
		return "team Lunch";
	}
	
}