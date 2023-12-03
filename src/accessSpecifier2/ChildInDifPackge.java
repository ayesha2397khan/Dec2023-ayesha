package accessSpecifier2;

import accessSpecifier.Parent3;
public class ChildInDifPackge extends Parent3 {
	public static void main(String[] args) {
		ChildInDifPackge p = new ChildInDifPackge();
//		p.method1();       //private
//		p.method2();       //defualt
//		p.method3();      //protected
		p.method4();
		
		
	}
}
