package accessSpecifier;

public class GeneralClass {
	public static void main(String[] args) {
		Parentclass p = new Parentclass();
	 //p.bunglow();          //private
		p.farm();               //defualt
		p.jwellery();          //protected
		p.car();                //public
		
		Childclass c = new Childclass();
	 //c.bunglow();        //private
		c.farm();            //defualt
		c.jwellery();       //protected
		c.car();            //public
	}
	
}
