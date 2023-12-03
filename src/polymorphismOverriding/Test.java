package polymorphismOverriding;
//Always latest code execute--->this is called method overriding
//bunglow(); method is available in parent class also child class but latest code execute
//and achived methodoverriding polymorphism need to inheritance extends parent to child.
public class Test {
	
public static void main(String[] args) {

	Child c=new Child();
	c.bunglow();
	c.farm();
	c.car();
	c.jwellery();
}
}
