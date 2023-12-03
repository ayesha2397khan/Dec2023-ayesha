package accessSpecifier;

public class Parentclass {
	
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
		Parentclass p = new Parentclass();
		p.bunglow();
		p.farm();
		p.jwellery();
		p.car();
	}
}
