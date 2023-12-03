package method;
import method2.Sample3;
public class Sample1 {

	public void method1() {
		System.out.println("non static method 1: same class");
	}
	
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.method1();	
	   Sample2 s2 = new Sample2();
	   s2.method2();
	  Sample3 s3 = new Sample3();
	   s3.method3();
	   s3.method4();
	}
}
