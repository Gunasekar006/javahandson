package javaCoposition;

public class Car {
public String s;
	public Car(String s) {
		super();
		this.s=s;
		System.out.println("given car:"+s);
		carList();
		carRunning();
		// TODO Auto-generated constructor stub
	}
	
	private void carList() {
		System.out.println("bmw");
		System.out.println("suzuki");
		System.out.println("honda");
		System.out.println("hyundai");
		System.out.println("select from above");
		
	}

	public void carRunning() {
		if(s.equals("bmw")) {
			System.out.println("premium class");
		}else if(s.equalsIgnoreCase("honda")){
	System.out.println("economy class");
		}else {
			System.out.println("car not found");
		}
	

}
}