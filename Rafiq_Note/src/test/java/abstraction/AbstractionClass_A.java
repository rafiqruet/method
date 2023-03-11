package abstraction;

public abstract class AbstractionClass_A {	//contains 0-100% abstract method. 
	
	public abstract void employeeName();	//these are abstract methods or incomplete methods
	
	public abstract void employeeID();
	
	public abstract void employeeSalary();
	
	public void companyName() {				//these are complete or concrete methods
		System.out.println("Smart_Tek");
	}
	
	public void employeeDepartment() {
		System.out.println("QA Automation Engineer");
	}
	
	public void employeeRegion() {
		System.out.println("New York");
	}
	

}
