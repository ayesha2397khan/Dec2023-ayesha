package interfaces1;

public class Test4 {
public static void main(String[] args) {
	

	Airtel a = new Airtel();
	a.calling();
	a.sms();
	a.netflix();
System.out.println("******************************************");
	BSNL b = new BSNL();
	b.calling();
	b.sms();
	b.hotstar();
	
	

}
}