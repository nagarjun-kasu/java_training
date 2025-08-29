package methods;

public class MethodsDemo12 {
	
	//static method
	static Dashboard getDetails(Employee emp){
		
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		emp.getEmployeeDetails();
		return new Dashboard();
	}
	
	public static void main(String[] args) {
		
		Dashboard db = MethodsDemo12.getDetails(new Employee());
		
		db.getDetails();
		System.out.println(db.id);
		System.out.println(db.companyName);
		
	}

}
