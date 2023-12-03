package methodWithParameter;

public class Sample1 {

public static void main(String[] args) {
	int min=100;
	int max=200;
	evenNumber(min,max);
}
public static void evenNumber(int i, int j) {
	for(int k=i; k<=j;k++) {
	
		if(k%2==0) {
			System.out.println(k);
		}
	}
}
}