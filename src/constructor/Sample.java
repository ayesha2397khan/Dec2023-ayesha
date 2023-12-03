package constructor;
//Default Constructor
public class Sample {
	int a;
	boolean b;
	char c;
	float d;
	short e;
	String s;
public static void main(String[] args) {
	Sample s=new Sample();
	s.method();
}
public void method() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(s);
	
}
}
