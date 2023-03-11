package basic;

public class Variable_Methods {
			

	int i = 10; /* instance variable (outside method, inside class, starting with data type. can
				 be accessed in this class)*/
	static int g = 20; /* global variable (outside method, inside class, starting with static keyword.
					      can be accessed across the project)*/

	static void Static_void_method() { // static, void or non-return method
		System.out.println("Showing static or global vaiable" + " " + g);
	}

	void Non_static_void() { // non static void method. non-static method can have both static/global & instance variable
		System.out.println("Showig non static or instance variable and global or static variable" + " " + i + ","+ g);
	}
	
	static int return_method1() {	//static return method. static method can only have static or global variable
		return g;
		
	}
	
	int return_method2() {	//non static return method
		return i;
	}
		
		void Parameterized_method(String name, int salary) {	//non static Parameterized method
				System.out.println("My name is "+name+" "+ "and my salary is "+salary);
	}

	public static void main(String[] args) { // main method, only where codes execute
		int l = 30; // local variable. can be accessed inside this method.

		Variable_Methods obj = new Variable_Methods(); // object created for class A

		
		// Calling other method inside main method.
		// ==============================
		
		Variable_Methods.Static_void_method(); // calling static method by class name
		obj.Non_static_void(); // calling non-static method by object
		obj.Parameterized_method("Rafiq", 80000);
		obj.Parameterized_method("XYZ", 60000);
		
		// ==============================

		
		System.out.println("Multiplication of two return method ="+" "+Variable_Methods.return_method1()*obj.return_method2());
	}
	
	//=================================================================================/

}







