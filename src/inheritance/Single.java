package inheritance;

//Single level inheritance

	class Parent {
		  public void method2() {
			System.out.println("parent method");
		}
	}
	public class Single extends Parent {
	      public void method() {
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		Single s=new Single();
		s.method();
		s.method2();
	}
}
