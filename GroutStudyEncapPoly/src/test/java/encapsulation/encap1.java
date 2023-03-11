package encapsulation;

public class encap1 {
	
	private String name = "ABC";

	protected String getName() {
		System.out.println("Showing name: "+ name);
		return name;
	}

	public static void main(String[] args) {
		encap1 obj = new encap1();
		
		obj.getName();
	}
}

