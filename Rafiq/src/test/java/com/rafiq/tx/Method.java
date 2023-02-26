package com.rafiq.tx;

public class Method {

	static int x = 10;
	int y = 20;
	
	void Jauwad() {
		//System.out.println(y);
	}
	
	int Rasel(int z, int a) {
		int k = z + a;
		return k;
	}
	//public void int Rafiq(int i, int e) {
			//	int j  = i + e;
			//System.out.println(j);
	//}
	
	public static void main(String[] args) {

		Method obj = new Method();
		obj.Jauwad();
		String r = "50" ;
		System.out.println(obj.Rasel(25,25) +" = "+ r);
		
		//obj.Rafiq(1, 2);
		
	}

}
