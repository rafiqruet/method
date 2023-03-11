package encapsulations;

public class Encap_1 {

	private String name = "Rafiqul Islam";
	private String designation = "QA Automation Engineer";
	private int salary = 100000;

	public String getName() {									//These are getter methods. this one is public so it can be called from other class
		System.out.println("Employee Name : " + name);
		return name;
	}

	private String getDesignation() {
		System.out.println("Employee designation : " + designation);
		return designation;
	}

	private int getSalary() {
		System.out.println("Employee Salary : " + salary);
		return salary;
	}

	public static void main(String[] args) {
		Encap_1 obj = new Encap_1();
		obj.getName();
		obj.getDesignation();
		obj.getSalary();
	}

}
