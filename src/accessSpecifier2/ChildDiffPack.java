package accessSpecifier2;
import accessSpecifier.Parent4;
public class ChildDiffPack extends Parent4{
	public static void main(String[] args) {
		Parent4 p = new Parent4();
//		p.bunglow();     //private
//		p.farm();         //default
//		p.jwellery();     //protected
		p.car();           //public
		
		ChildDiffPack c = new ChildDiffPack();
//		c.bunglow();     //private
//		c.farm();         //default
		c.jwellery();     //protected
		c.car();           //public
		
	}
}
