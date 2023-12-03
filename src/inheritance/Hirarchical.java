package inheritance;

// Hirarchical inheritance

class india{
	public void method() {
		System.out.println("india parent");
	}
}
class mumbai extends india{
	public void method1() {
		System.out.println("mumbai child");
	}
}
public class Hirarchical extends india {
	public void method2() {
		System.out.println("Hirarchical child");
	}
	public static void main(String[] args) {
		Hirarchical h=new Hirarchical();
		h.method();h.method2();
		mumbai m=new mumbai();
		m.method();m.method1();
	}
}
