package string;
//indexOf-->left to right check character(forword direction)
//lastIndexOf-->right to left check character(reverce direction)
//substring(2,8)-->only one part outside --Given string break some part--(remove sum part for print)
//substring from given 1st index to last index all character Print             
//substring(2)-->substring from given index to last index--(All Print)
//concat-->Mearge 2 String(2 and more than 2 method merge use concat method)
//replace-->replace char,word,total String,variable,also remove old character to new character replace.

public class MethodsString3 {
public static void main(String[] args) {
	String s1="aspire";
	String s2="AsPire";
	String s3="aspire Pune";
	String s4=null;
	String s5="a";
	boolean a = s3.contains(s1);
	System.out.println(a); 
	System.out.println(s3.indexOf('i'));
	System.out.println(s3.lastIndexOf('i'));
	System.out.println(s3.substring(2,8));//first char include and last cahr was not include-->pire P
	System.out.println(s3.substring(2));
//concat
	String s6=s1+s2;  //1 method
	System.out.println(s6);
	System.out.println(s1.concat(s2)); //2 method
	System.out.println(s1.concat(s2.concat(s3))); //1 method
	System.out.println(s1.concat(s2).concat(s3)); //2 method
	System.out.println(s3.replace('e', 'M'));
	System.out.println(s3.replace("aspire", s2));
	
}
}
