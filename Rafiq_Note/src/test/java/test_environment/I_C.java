package test_environment;

public class I_C extends I_B {
	public String today() {
		return "Saturday";

}
	
	public static void main(String[] args) {
		I_C obj = new I_C();
		
		System.out.println(obj.today());
		System.out.println(obj.thismonth());
		System.out.println(obj.thisyear());
	}
}
