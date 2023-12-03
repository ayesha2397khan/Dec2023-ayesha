package polymorphismOverloading;

public class Child extends Parent{

	public void mobile() {
		System.out.println("child mobile");
	}
	public void car() {
		System.out.println("child car");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.car();
	}
}
