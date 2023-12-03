package accessSpecifier2;
import accessSpecifier.Parent;
public class ChildFromdiffPack {

	public static void main(String[] args) {
		Parent p = new Parent();
//		p.bunglow();      //private
//		p.farm();        //default
//		p.jwellery();      //protected
		p.car();          //public
	}
}
