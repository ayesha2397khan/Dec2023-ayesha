package string;

public class Split {
public static void main(String[] args) {
	String s1="aspire Training Institute Pune";
	String[] s = s1.split("i");
	//{aspire ,Training ,Institute, Pune}
	System.out.println(s[0]);
	System.out.println(s[1]);
	System.out.println(s[2]);
	System.out.println(s[3]);
	System.out.println(s[4]);
	
}
}
