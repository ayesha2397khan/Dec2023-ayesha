package string;

public class Sample2 {
public static void main(String[] args) {
	String a="Aspire";
	String b="Aspire";
	String c=new String("Aspire");
	String d=new String("Aspire");
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(c==d);
	//***********************************************
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	System.out.println(c.equals(d));
	
	
}
}
