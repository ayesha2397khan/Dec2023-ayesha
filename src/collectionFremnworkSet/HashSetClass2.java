package collectionFremnworkSet;
//Order of insertion not maintained
//Duplicate Not Allowed
//For Loop Not Allowed-->bcoz for loop used index and here not any index
//-->here data stored in table not any index
//contains---->this method used to check the particulaer item is here or not for ex.-->"pune"
import java.util.HashSet;

public class HashSetClass2 {
public static void main(String[] args) {
	System.out.println("****HashSet Program Output****");
	HashSet hs = new HashSet<>();
	hs.add("ayesha");
	hs.add("khan");
	hs.add(345123);
	hs.add('A');
	hs.add("pune");
	hs.add(null);
	hs.add(null);
	hs.add(null);
	hs.add(null);
	hs.add(false);
	hs.add("ayesha");
	hs.add("khan");
	System.out.println(hs);
	System.out.println(hs.contains("pune"));  //chek items is stay or not
	hs.remove('A');
	System.out.println(hs);
	hs.add("sonu");
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println("*****forEach loop*****");
	for(Object temp:hs) {
		System.out.print(temp+",");
	}
	System.out.println();
	
	System.out.print("*****for loop*****");
//	for(int i=0; i<hs.size();i++) {
//		System.out.println(i+",");         Not Allowed forloop
//	}
}
}
