package ambiguity;

public class ChildOfIndia implements India2,India{

	
	public void mumbai() {
		System.out.println("mumbai from parent 1");
		
	}

	
	public void pune() {
		System.out.println("pune from parent 1");
		
	}

	
	public void jaipur() {
		System.out.println("jaipur from parent 2");
		
	}

	
	
	public void junnar() {
		System.out.println("junnar from parent 2");
		
	}

	
public static void main(String[] args) {
	ChildOfIndia c = new ChildOfIndia();
	c.mumbai();
	c.pune();
	c.jaipur();
	c.junnar();
	
}



}
