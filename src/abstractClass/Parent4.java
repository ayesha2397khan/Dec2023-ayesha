package abstractClass;

public abstract class Parent4 {
 public Parent4() {
	 //constructor available in parent class, also child class,
	 //But can't create object bcoz incomplete method.
	 //where complete all method this concrete method complete that class create object. 
	 //bcoz there all complete method.
	 
 }
	
	public void bunglow() {
		System.out.println("Parent bunglow");
	}
	
	public abstract void farm();
	public abstract void car();
}
