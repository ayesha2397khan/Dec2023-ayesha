package exceptionHandling;

public class NestedTry {
public static void main(String[] args) {
	int a=0;
	int b=20;
int [] c= {2,3,0,4};
int div=0;
int sum=0;
try {
	sum=b+c[0];
	try {
		div=sum/a;
	}
	catch(ArithmeticException e) {
		System.out.println("Div no with zero");
	}
			
}
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println("Array index out of capacity");
	}	
}
}
