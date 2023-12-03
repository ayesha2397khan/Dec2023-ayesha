package inheritance;

public class Child1 extends Parent1 {
	public void bike() {
		System.out.println("child bike");
	}
	
	public static void main(String[] args) {
		Child1 c=new Child1();
		c.bike();
		c.bunglow();
		c.car();
	}
}
