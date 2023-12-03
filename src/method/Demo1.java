package method;
import method2.Demo3;
//a name in java is called aas identifier
//same class-->method name
//diff class-->class name.method name
//diff pack-->pack name.class name & class name.method name
public class Demo1 {

	public static void method1() {
		method4();
		System.out.println("static method 1:same class");
	}
	public static void method4() {
		method5();
		System.out.println("static method 4:same class");
	}
	public static void method5() {
		System.out.println("static method 5:same class");
	}
	
	public static void main(String[] args) {
		method1();
		method1();
		Demo2.method2();
		Demo3.method3();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
