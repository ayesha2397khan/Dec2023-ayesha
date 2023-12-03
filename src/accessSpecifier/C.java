package accessSpecifier;

public class C {
	public static void main(String[] args) {
		int sum=A.a+
				A.b+
			//	A.c+
				A.d;
		System.out.println(sum);
	}
	
}
