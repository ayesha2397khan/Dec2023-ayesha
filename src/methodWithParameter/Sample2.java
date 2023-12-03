package methodWithParameter;

public class Sample2 {
public static void main(String[] args) {
	int min =10;
	int max=30;
	divisibleby5(min,max);
}

public static void divisibleby5(int i,int j) {
	for(int k=i; k<=j; k++) {
		if(k%5==0) {
			System.out.println(k);
		}
	}
}
}
