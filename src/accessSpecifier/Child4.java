package accessSpecifier;

public class Child4 extends Parent4 {
	public static void main(String[] args) {
		Parent4 p = new Parent4();
	//	p.bunglow();     //private
		p.farm();         //default
		p.jwellery();     //protected
		p.car();           //public
	}
}
