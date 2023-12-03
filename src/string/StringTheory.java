package string;
public class StringTheory {
//String is Non Primitive Dataype
//Memory size is not fixed
//String is class name Not a Keyword
//String is class present in "java.lang" package
//	String is collection of character 
//At the time of string declaration ,intialization,object creation takes place .
//String is final class that can not be inherited
//Object Creation 2 Ways--->
	//1.Without using new keyword
	//2.using new keyword 	(if create object that store in non constatnt pool area)
//*****************************************************************************************************************
	//Q.Why String is immmuatable?
//String objects are immuatable ----->Once create a 1 String make object then create the object String s="Aspire"
	//then i will change the value String s="Aspire Pune".
	//if simple change in value(minor change) then automaticaly create new seprate object
	//It is not reuse already save location,Every time change new object thats why String is immuatable
	//here not changes in same object Every changes created new object 
	//StringBuffer is alternate solution is mutable 
	//Memory is wastage--when new object create memory west
//*****************************************************************************************************************	
	//Memory Allocation in JVM
	//1 Stack area
	//1.Runtime stack -----> Whene any output is print on console this area is called stack area.
	
	//2Method area
	//1.Static data----->Method area it will store static data,static method, static variable.
	
	//3.*Heap area*
	//1.Object data ,instance variable,instance method,Arrays,string it is all data store in heap area.
	
	//4.PC registers
	//1.execution threads are store in this area
	
	//5.Native method static area.
	
//******************************************************************************************************************	
	 //***Heap area***
	//String pool area--->When String are store this area called string pool area, here only string data stored.
	
	//Non-Constant String pool area--->Remaining part in between String pool area and Constant String pool area
   //is called as Non-Constant String pool area.
	            //----->1.When use new keyword to make a object String this string stored in Non-Constant String pool area. 
	           //----->2.Add Duplicate Contained
	          //----->3.Whenever use new keyword always create new object 
	         //----->4.When create object dosent check old same object thats why Duplicate object
	
	//Constant String pool area---->//1.This is part of string pool area,
	                                             //2.In Constant String pool area dosent make duplicate object.
	                                            //3..(No Duplicate)
                                               //4.When create object check old same object and then make new object
	
	
	
	
	
	
	
	
	
	
	
	
	
}
