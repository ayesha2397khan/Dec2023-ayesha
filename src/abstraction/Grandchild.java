package abstraction;

public class Grandchild extends Child {
	
	public void farm() {
		System.out.println("Grandchild farm");	
	}
	public static void main(String[] args) {
		 Grandchild g=new  Grandchild();
		 g.car();
		 g.bunglow();
		 g.farm();
	}
}
