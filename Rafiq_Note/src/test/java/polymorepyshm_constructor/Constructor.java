package polymorepyshm_constructor;

public class Constructor {

	

	public Constructor(int age, String name) {
		System.out.println("Age: "+age+"; "+"Name: "+ name);
	}
	public Constructor(String name, int age) {
		System.out.println("Age: "+age+"; "+"Name: "+ name);
	}

	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor(10,"Rafiqul Islam");
		Constructor obj2 = new Constructor(11,"XYZ");
}
}
