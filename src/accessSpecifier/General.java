package accessSpecifier;

public class General {
	public static void main(String[] args) {
		Parent p = new Parent();
	//	p.bunglow();      //private
		p.farm();        //default
		p.jwellery();      //protected
		p.car();          //public
	}
	
}
