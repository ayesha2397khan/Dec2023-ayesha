package mock;

public class ReverceNumbers {
public static void main(String[] args) {
	int num=486;      //486/10=48.6      48/10=4.8
	int rev=0;              //6*10=60+8=68*10+4=684
	while(num>0) {
		int rem=num%10;
		num=num/10;
		rev=rev+rem*10;
	}
	System.out.println(rev);
}
}
