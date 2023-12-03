package accessSpecifier;
//same package diff class private not access remining are access.
public class Child3 extends Parent3{
	public static void main(String[] args) {
		Child3 p = new Child3();
	//	p.method1();       //private
		p.method2();       //defualt
		p.method3();      //protected
		p.method4();      //public
		
	}
}
