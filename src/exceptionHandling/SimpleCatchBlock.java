package exceptionHandling;
//ArithmeticException--->ArithmeticError
//risky code--->Always keeping in try block
public class SimpleCatchBlock {
public static void main(String[] args) {
	int a=0;
	int b=20;
	int div = 0;
	
	try {
		div=b/a;      //risky code
	}
	
	         //class name      //variable
	catch(ArithmeticException e){
		//alternate code
		System.out.println("Do not divide any number with zero");
	}
	System.out.println(b);
	System.out.println(div);
}
}
