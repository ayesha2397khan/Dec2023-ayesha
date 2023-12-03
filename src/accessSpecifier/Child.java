package accessSpecifier;

public class Child extends Parent{
	public static void main(String[] args) {
		Parent p = new Parent();
		//p.bunglow();      //private
		p.farm();        //default
		p.jwellery();      //protected
		p.car();          //public
	}
}
