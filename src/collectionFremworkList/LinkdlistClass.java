package collectionFremworkList;
//Oreder of insertion is maintained
//duplicate is allowed 
//null value multiple is allowed
//only program backgraound is change 
import java.util.LinkedList;
public class LinkdlistClass {
public static void main(String[] args) {
	System.out.println("***LinkedList Program Output***");
	LinkedList ll = new LinkedList<>();
	 ll.add("Ayesha");         //string
	 ll.add("khan");           //string
	 ll.add('A');                //char
	 ll.add(12345654879831654l); //long
	 ll.add(90.45);        //float
	 ll.add("pune");     //string
	 ll.add(411025);  //int
	 ll.add(null);      //string
	 ll.add(null);      //string
	 ll.add(null);      //string
	 ll.add(null);      //string
	 ll.add(true);    //boolean
	 ll.add("Ayesha");         //string
	 ll.add("khan");           //string
	System.out.println(ll);
	ll.set(2, 'B');
	System.out.println(ll);
	ll.remove(2);
	System.out.println(ll);
	boolean c = ll.contains("pune");
	System.out.println(c);
	for(Object linke:ll) {
		System.out.print(linke+",");
	}
	System.out.println();
	
	for(int i=0;i<ll.size();i++) {
		System.out.print(ll.get(i)+",");
	}
}
}
