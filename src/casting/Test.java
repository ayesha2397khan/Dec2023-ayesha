package casting;

public class Test {
public static void main(String[] args) {
	
	Parent p = new Parent();
	p.bunglow();     //p&c
	p.farm();          //p
System.out.println("*******************");	
	Child c = new  Child();
	c.bunglow();         //p&c
	c.farm();               //c
	c.car();                 //c
System.out.println("*******************");
	Parent pc = new  Child();
	pc.bunglow();
	pc.farm();

	
	
	
	
}
}
