package test_environment;

public class AbsB extends AbsA  {
	
	public void carcolor() {
		System.out.println("Car color = Red");
	}

	public static void main(String[] args) {
		
		AbsB obj = new AbsB();
		
		obj.carcolor();
		obj.carmodel();
		System.out.println(obj.caryear());

	}

	@Override
	public void carmodel() {
		System.out.println("Car model = Honda Civic");
		
	}

	@Override
	public int caryear() {
		return 2022;
	}

}
