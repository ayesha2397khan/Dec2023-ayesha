package finalKeyword;
//final--->class, variable, method also final keyword use.

final public class Parent {    //final for class-->class can not be used for inheritence as parent class

	int a=124;
	final int b=121;           //final for varibale-->value can't be changed later on
	
	public void m1() {
		a=20;
//		b=20;
		System.out.println("m1");
	}
	final public void m2() {              //final for method-->method can't be override
		System.out.println("m2");
	}
}
