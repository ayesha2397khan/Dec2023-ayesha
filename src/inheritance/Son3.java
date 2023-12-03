package inheritance;
class Dad{
	public void method1() {
		System.out.println("parent method");
	}
}
class son1 extends Dad{
public void method2() {
	System.out.println("son1 method");
	}
}
class son2 extends Dad{
public void method3() {
	System.out.println("son2 method");
	}
}
public class Son3 extends Dad {
	public void method4() {
		System.out.println("son3 method");
		}
	public static void main(String[] args) {
		Son3 h = new Son3();
		h.method1();
		h.method4();
		son1 h2 = new son1();
		h2.method1();
		h2.method2();
		son2 h3 = new son2();
		h3.method1();
		h3.method3();
		

	}
}
