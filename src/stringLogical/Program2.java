package stringLogical;

public class Program2 {
public static void main(String[] args) {
	String s="Ayesha khan";
    String[] str = s.split("");
    String rev="";
	for(int i=str.length-1; i>=0; i--) {
		rev = rev+str[i];
	}
	System.out.println(rev);
}
}
