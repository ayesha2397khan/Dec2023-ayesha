package screenshot;

import java.util.Date;

import net.bytebuddy.utility.RandomString;

public class Sample3 {
public static void main(String[] args) {
	String s1=RandomString.make(2);
	System.out.println(s1);
	
	 //s2=Ran
	
	Date d = new Date();
	String timestamp=d.toString().replace(' ','_' ).replace(':', '_');
	System.out.println(timestamp);
	
}
}
