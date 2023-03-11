package polymorepyshm_constructor;

public class M_OverLoading {
	
	
    public void employeeInfo(String name) {
    	System.out.println("Employee Name : "+name);
    }
    
    public void employeeInfo(int salary) {
    	System.out.println("Employee Salary : "+salary);
    }
    
    public void employeeInfo(String des, int age) {
    	System.out.println("2023: Employee designation : "+des +" & age : "+ age);
    }
     
    public void employeeInfo(int age, String des) {
    	System.out.println("2024: Employee designation : "+des +" & age : "+ age);
    }
    
    
    public static void main(String[] args) {
    	M_OverLoading obj = new M_OverLoading();
    	
       	obj.employeeInfo("Rafiqul Islam ");
    	obj.employeeInfo(120000);
    	obj.employeeInfo("QA Engineer", 10);
    	obj.employeeInfo(11, "Senior QA");
 

	}
    
    
}
