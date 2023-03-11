package inheritance;

public class C extends B{
	
	public void location() {
	String location = "Texas";
	System.out.println("Location: "+location);
	}
	
	public static void main(String[] args) {
		C obj = new C();
		
		obj.name();
		obj.salary();
		obj.location();
	}

}
