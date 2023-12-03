package ambiguity;

public class Test implements Parent1,parent2{

	
	public void method1() {
	    System.out.println("multiple inheritance 1");
		
	}
	public void method() {
		System.out.println("multiple inheritance 2");
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.method();
		t.method1();
	}

}
