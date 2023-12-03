package accessSpecifier;

public class Childclass extends Parentclass{
	public static void main(String[] args) {
		Parentclass p = new Parentclass();
	 //p.bunglow();     //private
		p.farm();          //defualt
		p.jwellery();      //protected
		p.car();            //public
	}
}
