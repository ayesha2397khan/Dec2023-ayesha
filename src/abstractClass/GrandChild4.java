package abstractClass;

public class GrandChild4 extends Child4{
	
	public void car() {
		System.out.println("GrandChild car");
		
	}
	public static void main(String[] args) {
		GrandChild4 gc = new GrandChild4();
		gc.bunglow();
		gc.farm();
		gc.car();
	}

}
