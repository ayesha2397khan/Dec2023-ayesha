package polymorphismOverloading;
//Declaring multiple method with same method name but with diff argument in same class,
//is called MethodOverloading.
//Bcoz compile time we know any error thats why its name is compiletime .
public class CompileTimePolymorphism {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
 CompileTimePolymorphism cp = new CompileTimePolymorphism();
    
	cp.addition(100, 200);
	cp.addition(100, 200, 300);
}
	public  void addition(int a,int b) {//method declartion ==> method name line (only declartion)
		//method defination ==> code (actual code)
		int sum=a+b;
		System.out.println(sum);
	}
	public  void addition(int a,int b,int c) {
		
		int sum=a+b+c;
		System.out.println(sum);
	}
public  void addition() {
		
		
	}
public  void addition(int s,boolean e) {
	
	
}
}
