package stringBuilder;
//use multiple threading****
public class StringBuilderClass {
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
