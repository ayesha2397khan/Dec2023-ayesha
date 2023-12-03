package accessSpecifier;

public class General4 {
	public static void main(String[] args) {
		Parent4 p = new Parent4();
//	    p.bunglow();     //private
		p.farm();         //default
		p.jwellery();     //protected
		p.car();           //public
	
	
		Child4 c = new Child4();
//		c.bunglow();     //private
		c.farm();         //default
		c.jwellery();     //protected
		c.car();           //public
	}
}
