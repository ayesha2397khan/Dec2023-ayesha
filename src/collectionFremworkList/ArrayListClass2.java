package collectionFremworkList;
//***********************************************************************************************
//iterator-----> All Collection
//list iterator-----> List (Not for Set)
//enumeration------>Vector
//***********************************************************************************************
//Iterator is one of the opetional method available used to fetch the data from collecion
//Iterator is Single Director Cursor
//Iterator is not add,delete operation
//************************************************************************************************
//Order of insertion maintained
//duplicate are allowed in Arraylist
//allows any number of null values
//Arraylist Not good for data manipulation bcoz add data in middle so sequence index, data is changed
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListClass2 {
public static void main(String[] args) {
	System.out.println("***ArrayList Program Output***");
	
	ArrayList al = new ArrayList<>();
	al.add("Ayesha");         //string
	al.add("khan");           //string
	al.add('A');                //char
	al.add(12345654879831654l); //long
	al.add(90.45);        //float
	al.add("pune");     //string
	al.add(411025);  //int
	al.add(null);      //string
	al.add(null);      //string
	al.add(null);      //string
	al.add(null);      //string
	al.add(true);    //boolean
	al.add("Ayesha");  //string
	al.add("khan");   //string
	System.out.println(al);
	al.add(5, "job");
	System.out.println(al);
	al.remove(5);
	System.out.println(al);
	boolean a = al.contains(90.45);
	System.out.println(a);
	al.set(4,461366);
	System.out.println(al);
	System.out.println(al.get(4));
	
	System.out.println("Print all Arraylist element with for each loop");
	for( Object temp:al) {
		System.out.print(temp+",");
	}
	System.out.println();
	
	System.out.println("Print all Arraylist element with for loop");
	for(int i=0; i<al.size();i++ ) {
		System.out.print(al.get(i)+",");
	}
      System.out.println();
 //******************************************************************************************     
	System.out.println("****Iterator cursor****");
	Iterator itr = al.iterator();
//	System.out.println(itr.next());
//	System.out.println(itr.next());
//	System.out.println(itr.next());
//	System.out.println(itr.next());
//	System.out.println(itr.hasNext());
//	itr.remove();
//	System.out.println(itr);
//	while(itr.hasNext()) {
//		System.out.print(itr.next()+",");
//	}
//********************************************************************************************	
	System.out.println("*******ListIterator Cursor**********");
	ListIterator lc = al.listIterator();
//	System.out.println(lc.next());
//	System.out.println(lc.next());
//	System.out.println(lc.next());
//	System.out.println(lc.next());
//	System.out.println(lc.hasNext());
//	System.out.println(lc.previous());
//	System.out.println(lc.previous());
//	System.out.println(lc.previous());
//	System.out.println(lc.hasPrevious());
//	lc.remove();
//	System.out.print(lc);
	while(lc.hasNext()) {
		System.out.print(lc.next()+",");
	}
	
}
}
