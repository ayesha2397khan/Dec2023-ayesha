package stringBuffer;
//use for mutable*****
//append --->when two string are merge use append
//capacity-->check capacity
//ensureCapacity-->stringbuffer capacity
//insert-->add some data in string
//delete-->delete some data in string(Additional in stringbuffer not in string)
//reverce-->reverse the string
public class StringBufferClass {
public static void main(String[] args) {
	StringBuffer sbf = new StringBuffer();
	System.out.println(sbf.capacity());
	sbf.append("Aspire");
	System.out.println(sbf);
	System.out.println(sbf.capacity());
	sbf.append("Training");
	sbf.append("Institute");
	sbf.append("Pune");
	System.out.println(sbf);
	System.out.println(sbf.capacity());
	sbf.ensureCapacity(142);
	System.out.println(sbf.capacity());
	System.out.println(sbf.insert(2, "Khan"));
	System.out.println(sbf.delete(3,5));
	sbf.reverse();
	System.out.println(sbf);
	
	
}
}
