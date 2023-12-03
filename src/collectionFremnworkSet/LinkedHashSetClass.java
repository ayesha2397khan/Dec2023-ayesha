package collectionFremnworkSet;
//Oredr of Insertion (Seqvence)Maintained
//Duplicate Not Allowed
//Only 1 Null Value Allowed
//For Loop Not Used in LinkedHashSet
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
public static void main(String[] args) {
	LinkedHashSet lhs = new LinkedHashSet<>();
	System.out.println("****LinkedHashSet Program Output****");

	lhs.add("ayesha");
	lhs.add("khan");
	lhs.add(345123);
	lhs.add('A');
	lhs.add(4465513219874879854l);
	lhs.add("pune");
	lhs.add(null);
	lhs.add(null);
	lhs.add(null);
	lhs.add(null);
	lhs.add(false);
	lhs.add("ayesha");
	lhs.add("khan");
	System.out.println(lhs);
	System.out.println(lhs.contains("pune"));
	lhs.remove("pune");
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println("****forEach loop****");
	for(Object temp:lhs) {                            //Object data type menas whene all type of data available
		System.out.print(temp+",");
	}
	System.out.println("****for loop****");
//	for(int i=0; i<lhs.size();i++) {
//		System.out.println(i);           Not Use For Loop in LinkedHashSet
//	}
	
}
}
