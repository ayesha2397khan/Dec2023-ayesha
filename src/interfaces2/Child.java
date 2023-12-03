package interfaces2;

public class Child implements Parent2,Parent{

	public void method1() {
		System.out.println("method 1");
		
	}
	public void method2() {
		System.out.println("method 2");
		
	}
	public void method3() {
		System.out.println("method 3");
		
	}
	public void method4() {
		System.out.println("method 4");
		
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();c.method2();c.method3();c.method4();
	}
}
