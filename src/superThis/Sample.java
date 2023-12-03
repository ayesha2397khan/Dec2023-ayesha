package superThis;

public class Sample {
int a;
int b;

public  void setValue(int a,int b) {
	this.a=a; //global  a= local a
	this.b=b;
}
public static void main(String[] args) {
	Sample s = new Sample();
	s.setValue(10,20);
	System.out.println(s.a);
	System.out.println(s.b);
}
}
