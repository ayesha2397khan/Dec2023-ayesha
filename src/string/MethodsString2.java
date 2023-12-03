package string;
//In String-->is empty,null,paraghraph,single character
//contains--->contains method is always checking one string in with another string as it is part or not
//isEmpty()--->Not apply (null) 
//charAt--->get the identify index(only 1 index identify)
//length()-1--->find last index
//endswith--->find last character
//startswith--->find first character
//
//Diff bet contains,startswith,endswith?
//1.startswith-Focus is only start character
//2.endswith-Focus is only end character
//3.contains-contains dosent matter start,end or middle
public class MethodsString2 {
public static void main(String[] args) {
	String s1="aspire";
	String s2="AsPire";
	String s3="aspire Pune";
	String s4=null;
	String s5="a";
	System.out.println(s3.contains(s1));
	System.out.println(s3.contains(s2.toLowerCase()));
	System.out.println(s3.contains("k"));
	System.out.println(s3.toUpperCase());
	System.out.println(s3.contains(""));
	System.out.println(s5.isEmpty());
	System.out.println(s3.charAt(0));
	System.out.println(s3.charAt(s3.length()-1));
	System.out.println(s3.startsWith("s"));
	System.out.println(s3.endsWith("e"));
	
	
	
	
}
}
