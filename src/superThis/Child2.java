package superThis;
//when same name variable that time use super this keyword
//super-->parent class global value
//this-->same class local value
//directly-->
public class Child2 extends Parent2{
int a=100;
int b=200;
int d=300;

public void addition() {
	int a=1000;
	int b=2000;
	int e=3000;
	
	System.out.println("super points to parent class global variables:a="+super.a);
	System.out.println("this points to same class global variables:a="+this.a);
	System.out.println("a="+a);
	
	int sum=super.a+super.b+this.b+b;   //10+20+200+2000=2230
	System.out.println(sum);
	
	int sum2=a+this.a+super.b+a+b;  //1000+100+20+1000+2000=4120
	System.out.println(sum2);
	
	int sum3=super.a+this.a+a;    //10+100+1000=1110	
	System.out.println(sum3);
	
	int multi =c*d*e;
	System.out.println(multi);
}

}
