package polymorphismOverloading;

//polymorphism program
//method overloading 
//compile time polymorphism

public class MethodOverload {
 float sum =0;
 int i=10;
 int j=20;
	public void addition() {
		sum=i+j;
		System.out.println(sum);
	}
	public void addition(int i) {
		sum=i*j;
		System.out.println(sum);
	}
	public void addition(int i ,int j) {
		sum=i-j;
		System.out.println(sum);
	}
	public void addition(float i,float j) {
		sum=i+j;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		MethodOverload m=new MethodOverload();
		m.addition();
		m.addition(10);
		m.addition(110, 120);
		m.addition(0, 0);
	}
}
