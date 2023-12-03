package accessSpecifier2;

import accessSpecifier.Parentclass;

public class ChildClassdiffPack extends Parentclass{
	public static void main(String[] args) {
		Parentclass p = new Parentclass();
//		p.bunglow();
//		p.farm();
//		p.jwellery();
		p.car();
		
		ChildClassdiffPack c = new ChildClassdiffPack();
//		c.bunglow();    //private
//		c.farm();          //default
		c.jwellery();     //protected
		c.car();            //public
	}
}