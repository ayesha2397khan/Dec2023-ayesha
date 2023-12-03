package inheritance;
//One sub class aquire some property from another super class 
//and that class aquire property for another super class that phenonmeny is contineous.
//minimum 3 class are required for multilevel inheritance.
class Computer{
	public void method1() {
		System.out.println("parent method");
	}
}
class laptop extends Computer{
public void method2() {
		System.out.println("child method");
	}
}
public class Multilevel2 extends laptop{
public void method3() {
	System.out.println("Grandchild method");
}
public static void main(String[] args) {
	Multilevel2 m=new Multilevel2();
	m.method1();
	m.method2();
	m.method3();
}
	}

