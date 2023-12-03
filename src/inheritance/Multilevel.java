package inheritance;

// Multilevel inheritance

class Parentclass{
	public void method() {
		System.out.println("parent");
	}
}
class Childclass extends Parentclass {
	public void method1() {
		System.out.println("child");
	}
}

public class Multilevel extends Childclass{
 public void method2() {
	 System.out.println("grandchild");
 }
 public static void main(String[] args) {
	 Multilevel m=new Multilevel();
	 m.method();
	 m.method1();
	 m.method2();
}
}
