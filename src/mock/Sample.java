package mock;

public class Sample {
	public static void main(String[] args) {
		String s="Ayesha";
		for(int i=0; i<s.length();i=i+2) {
			char ch=s.charAt(i);
			System.out.print(ch);
		}
	}
}
