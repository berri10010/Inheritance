package Overriding;

// Subclass is inheriting all the variables and methods defined in Base
public class Subclass extends Base {
	public static void main(String[] args) {
		Subclass s1 = new Subclass();
	}
	
	public Subclass() {
		SayHello(); // We are calling the SayHello method defined in base
	}
	
	@Override
	public void SayHello() {
		// TODO Auto-generated method stub
		super.SayHello();
		
		System.out.println("Hi");
	}
}
