package exceptionHandling;
//Nested try block
//How to handle exeption handling?
//Answer--->
//We can create the try catch block put the risky code inside the try block ,
//and that code through which handle the exception, 
//catch block ,the catch block are one or more in number ,
//finally block is opetional if required we can add maximum one 
//and when we add it we get 100% executed
//And the try blocks can we one and more in program ,
//and even we can write nested try blocks

public class NestedMultipletry {
public static void main(String[] args) {
	try 
	{
		try 
		{
			
			try 
			{
				//nested try block
			}	
			catch(Exception e){
				
			}
			finally {
				
			}
		}
		   catch(Exception e){
			
	    	}
	    }
	      catch(Exception e){
	    	  
	        }
		}
	
}

