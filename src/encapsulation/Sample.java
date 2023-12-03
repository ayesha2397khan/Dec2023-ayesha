package encapsulation;

public class Sample {
 private int a=10;
 private int b=20;
 private int password=1234;
 public void addition() {
	 int sum=a+b;
	 System.out.println(sum);
 }
 public void withdrawmoney() {
	 if(password==1234) {
		 System.out.println("Authentication successful");
	 }
 }
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.addition();
		s.withdrawmoney();
	}
}
