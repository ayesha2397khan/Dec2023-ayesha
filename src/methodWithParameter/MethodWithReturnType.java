package methodWithParameter;

public class MethodWithReturnType {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c = addition(2,3);
		System.out.println(c);
		int e = addition(1,2,7);
		System.out.println(e);
		int d = multiplition(10,5);
		System.out.println(d);
	}
	private static int addition(int i,int j) {  //i=a=10, j=b=20
		int sum=i+j;
		return sum;
	}
	private static int addition(int i,int j,int k) {
		int sum=i+j+k;
		return sum;
		
	}
	public static int multiplition(int p,int q) {
		int sum=p*q;
		return sum;
		
	}
}
