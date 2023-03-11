package inheritance;

public class MI_Class implements MI_InterfaceA, MI_InterfaceB{	//getting properties from A & B by implement keyword


	
	public static void main(String[] args) {
		MI_Class obj = new MI_Class();
		
		obj.name();
		obj.dept();
		obj.salary();
		obj.region();
	}

	//added unimplemented methods below
	
	public void salary() {
		int salary = 120000;
		System.out.println("Salary: "+ salary);
		
	}

	public void region() {
		String region = "Texas";
		System.out.println("Region: "+region);
		
	}

	public void name() {
		String name = "Rafiqul Islam";
		System.out.println("Name: "+name);
		
	}

	public void dept() {
		String dept = "QA Automation Engineer";
		System.out.println("Department: "+dept);
		
	}

}
