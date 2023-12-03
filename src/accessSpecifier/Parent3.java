package accessSpecifier;
//same class all modifiers access
public class Parent3 {

	private void method1() {
		System.out.println("private method 1 from parent class");
	}
    void method2() {
    	System.out.println("Defualt method 2 from parent class");
	}
   protected void method3() {
	   System.out.println("protected method 3 from parent class");
}
   
   public void method4() {
	  System.out.println("public method 4 from parent class");
}
  public static void main(String[] args) {
	Parent3 p = new Parent3();
	p.method1();
	p.method2();
	p.method3();
	p.method4();
	
	
}
}
