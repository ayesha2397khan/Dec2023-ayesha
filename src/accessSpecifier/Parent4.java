package accessSpecifier;

public class Parent4 {
	
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
	Parent4 p = new Parent4();
	p.bunglow();     //private
	p.farm();         //default
	p.jwellery();     //protected
	p.car();           //public
}
}
