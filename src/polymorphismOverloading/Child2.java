package polymorphismOverloading;

public class Child2 extends Parent2{
	
   public void multiplication(int a) {
		int b=200;
		int multi=a*b;
		System.out.println(multi);
	}
   public static void main(String[] args) {
	   Child2 ch = new Child2();
	   ch.multiplication();
	   ch.multiplication(2000);
	   
	   
	   
}
}
