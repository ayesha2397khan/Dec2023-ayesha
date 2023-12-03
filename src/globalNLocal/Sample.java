package globalNLocal;
//local and global depend where used
//And static and nonstatic when use keyword
//Global variables-->Inside class but not in any method
           //scope-->can be used through out the class
//Local variables-->Inside class also inside method/loop
          //scope-->only inside that block where it is declared
public class Sample {
static int a=10;             //global
public static void addition() {
	
	int b=20;             //local
	int sum=a+b;
	System.out.println(sum);
}
public static void multiplication() {
	int c=30;
//	int sum=a*b;
	for(int i=1;i<=5;i++) {
		int d=a+i;
	}
	
}
}
