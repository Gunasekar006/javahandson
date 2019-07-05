package javaCoposition;

public class Bike {
public String b;
	public Bike(String b) {
		super();
		this.b=b;
		bikes();
	}

	private void bikes() {
		// TODO Auto-generated method stub
		if(b.equalsIgnoreCase("yamaha")) {
			System.out.println("available in india");
		}else {
			System.out.println("not available");
		}
	}

	
	
}
