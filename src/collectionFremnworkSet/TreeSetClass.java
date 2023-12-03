package collectionFremnworkSet;
//Only Homogeneous data 
//Only One Type of  Datatype is allowed
//Duplicate Not Allowed
//Order of insertion Not Maintained
//Store Data in Asending Oreder
//contains,remove,size

import java.util.TreeSet;
public class TreeSetClass {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(232);
	ts.add(462245);
	ts.add(15);
	ts.add(8);
	ts.add(15);
	ts.add(2000);
	ts.add(2023);
	ts.add(-29);
	System.out.println(ts);
	System.out.println(ts.contains(200));
	ts.remove(15);
	System.out.println(ts.size());
	System.out.println(ts);
	System.out.println(ts.isEmpty());
	
}
}
