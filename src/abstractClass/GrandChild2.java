package abstractClass;

public class GrandChild2 extends Child3{

	
	public void jwellery() {
		System.out.println("Grand child jwellery");
		
	}
	
	
	public static void main(String[] args) {
		GrandChild2 g=new GrandChild2();
		g.bunglow();
		g.farm();
		g.jwellery();
	}

}
