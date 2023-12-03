package accessSpecifier;

public class A {
	
public static int a=10;
protected static int b=20;
private static int c=30;
static int d=40;

public static void main(String[] args) {
	int sum=a+b+c+d;
	System.out.println(sum);
}
}
