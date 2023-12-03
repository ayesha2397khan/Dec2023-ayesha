package encapsulation;

//encapsulation

public class Program1 {
	private int a=10,b=20;
	private int sum;
	
	public void method() {
		int sum=a+b;
		System.out.println(sum);
	}
public static void main(String[] args) {
	Program1 p=new Program1();
	p.method();
}
}
