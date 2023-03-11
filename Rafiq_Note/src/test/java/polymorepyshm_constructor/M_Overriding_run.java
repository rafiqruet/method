package polymorepyshm_constructor;

public class M_Overriding_run extends M_Overriding_1 {

	public void employeeName(String name) {
		name = "Rafiqul Islam ";
		System.out.println("Employee Name : " + name);
	}

	public static void main(String[] args) {
		M_Overriding_run obj = new M_Overriding_run();
		
		obj.employeeName("");
	}
}