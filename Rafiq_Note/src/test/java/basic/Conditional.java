package basic;

public class Conditional {

	public static void main(String[] args) {
		
		int age = 17;

		if (age >= 18) {
			System.out.println("Can register to vote");
		}

		else if (age < 18) {
			System.out.println("Not eligible to reigister to vote");
		}
	}

}
