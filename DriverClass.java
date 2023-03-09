package gl.GradedAssignment1;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HRDepartment hr = new HRDepartment();
		AdminDepartment adm = new AdminDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println("*********************"+hr.departmentName()+"******************************");
		System.out.println("Today's work : "+ hr.getTodaysWork());
		System.out.println("Work Deadline : " + hr.getWorkDeadline());
		System.out.println("Activity : " + hr.doActivity());
		System.out.println(hr.isTodayAHoliday());

		System.out.println("*********************"+tech.departmentName()+"****************************");
		System.out.println("Today's work : " + tech.getTodaysWork());
		System.out.println("Work Deadline : " + tech.getWorkDeadline());
		System.out.println("Stack Information : " + tech.getStackInformstion());
		System.out.println(tech.isTodayAHoliday());
		
		System.out.println("********************"+adm.departmentName()+"****************************");
		System.out.println("Today's work : "+ adm.getTodaysWork());
		System.out.println("Work Deadline : " + adm.getWorkDeadline());
		System.out.println(adm.isTodayAHoliday());
		System.out.println("****************************************************************");
	}

}
