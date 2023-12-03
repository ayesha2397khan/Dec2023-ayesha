package methodWithParameter;
//Parametrizedmethod-->generic program--not ant changes
//call method Outside any changes like value 
public class ParametrizedMethod {
public static void main(String[] args) {
	int a=10;
	int b=20;
	addition(2,3);
	addition(1,2,7);
	multiplition(10,5);
	
}
private static void addition(int i,int j) {  //i=a=10, j=b=20
	int sum=i+j;
	System.out.println(sum);
	
}
private static void addition(int i,int j,int k) {
	int sum=i+j+k;
	System.out.println(sum);
	
}
public static void multiplition(int p,int q) {
	int sum=p*q;
	System.out.println(sum);
	
}

}

