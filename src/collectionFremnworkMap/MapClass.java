package collectionFremnworkMap;
//Cursor ---->is also legacy(Older)
//Duplicate Key---->Not allowed
//Duplicate Value---->Allowed
//Key  Sequence is maintained (Order of insertion)---->Asending Order (Key)
//**********************************************************************************************
//put method--->Used to Add data
//get method---> Get the data from HashMap
//Size()---->to get the count of kay
//ContainsKey(kay)--->it will cheack the key is present in data set or not
//ContainsValue--->it will check the value is present in data set or not 
//**********************************************************************************************
import java.util.HashMap;

public class MapClass {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(1,"Akshay");
	hm.put(2,"Ashvini");
	hm.put(3, "Pooja"); 
	hm.put(4,"Akshay"); 
	System.out.println(hm);
	
	hm.put(3, "Siya");  //duplicate key
	//hm.put(4,"Akshay"); //duplicate value

	System.out.println(hm);
	System.out.println(hm.get(3));
	System.out.println(hm.size());
	System.out.println(hm.containsKey(5));
	System.out.println(hm.containsValue("Pooja"));
	System.out.println("******for loop******");
	for(int i=1; i<=hm.size(); i++) {
		System.out.print(hm.get(i)+",");
	}

}
}
