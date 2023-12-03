package string;
//****All methods created inside in  String class****
//Q.Diff Bet length And length()?
//length this is variable ,when array length identify use length
//length() this is method ,when String length identify use length()
//**********************************************************************************************
//Q.Diff Bet equals and equalsIgnorecase?
//1.In equals read contains 
//In equals Both string are exact same ,No any character difference in upper and lower case.

//1.In equalsIgnorecase dosent matter which data uppercase ,lowercase or mix case,
//all are valid But  ,Total alfabate are same .
//2.check equality of string ignore uppercase and lowercase.
//**********************************************************************************************
//1.toUpperCase()---->convert string to uppercase	
//2.toLowerCase()---->convert string to lowercase
//*******************************************************************************************
public class MethodsString1 {
public static void main(String[] args) {
	String s1="Aspire Pune";
	String s2="aspire";
	String s3="ASPIRE";
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toUpperCase());
	System.out.println(s3.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s3.toLowerCase());
	System.out.println(s1.length());
	System.out.println(s2==s3);
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	
}
}
