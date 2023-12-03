package accessSpecifier;

public class Parent {

	private void bunglow() {
		System.out.println("parent bunglow");
	}
	 void farm() {
		System.out.println("parent farm");
	}
	protected void jwellery() {
		System.out.println("parent jwellery");
	}
	public void car() {
		System.out.println("parent car");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.bunglow();      //private
		p.farm();        //default
		p.jwellery();      //protected
		p.car();          //public
	}
}
