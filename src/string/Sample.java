package string;
//Dif Bet == And equals?

// 1. Use == check same object or not.
//2.Dont check object contain.
//3.No use new keyword store constant string pool area.

//equals---> Use equals check same contains or not 
//Both are different

public class Sample {
public static void main(String[] args) {
	String a="Aspire";
	String b="Aspire";
	String c=new String("Aspire");
	String d=new String("Aspire"); 
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(c==d);
//*********Methods*********************	
	System.out.println(a.concat(b));
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	System.out.println(c.equals(d));
}
}
