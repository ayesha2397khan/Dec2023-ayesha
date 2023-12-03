package exceptionHandling;
//Count of catch block is one or more 
//Only 1 catch block execute one time
//catch(Exception h)------->1.This catch block always parent 
                                    // 2.And always last (End) catch block.
                                   //3.if any exception are not work then this time parent exception is worked
                                   //4.Is capable to catch all the Exception 
                                 
public class MultipleCatchBlock {
public static void main(String[] args) {
	int[] a= {1,2,6,4,8,9,2,0,61,5,80};
	int b=20;
	int div=0;
	try {
		 div =b/a[17];
	}
    catch(ArithmeticException e) {
		System.out.println("Dividing the number with zero");
	}
    catch(ArrayIndexOutOfBoundsException f) {  //when data is overflow
		System.out.println("Array Index count is overflow");
	}
    catch(StringIndexOutOfBoundsException g) {
		
	}
   catch(Exception h) {                       //(Parent)End catch block --Always last catch block
		System.out.println("parent exception class");
	}
	finally {
		System.out.println("Running from finaly block");
	}
	
	System.out.println(div);
}
}
