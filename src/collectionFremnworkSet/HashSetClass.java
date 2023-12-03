package collectionFremnworkSet;
//Order of insertion -->Random insertion
//Duplicate data not allowed in hashset
//Allow only 1 null value.

import java.util.HashSet;

public class HashSetClass {
public static void main(String[] args) {
	System.out.println("***HashSet Program Output***");
	
	HashSet hs = new HashSet();
	hs.add("Ayesha");         //string
	hs.add("khan");           //string
	hs.add('A');                //char
	hs.add(12345654879831654l); //long
	hs.add(90.45);          //float
	hs.add("pune");        //string
	hs.add(411025);     //int
	hs.add(null);         //string
	hs.add(null);        //string
	hs.add(null);       //string
	hs.add(null);      //string
	hs.add(true);    //boolean
	hs.add("Ayesha");     //string
	hs.add("khan");       //string
	System.out.println(hs);
	System.out.println(hs.contains("pune"));
	
}
}
