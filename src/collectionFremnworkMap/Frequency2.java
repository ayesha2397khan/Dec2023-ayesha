package collectionFremnworkMap;

import java.util.HashMap;

public class Frequency2 {
public static void main(String[] args) {
	int[] a={3,5,33,3,55,3,11,11};
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	for(int i=0; i<a.length;i++) {
		
		if(hm.containsKey(a[i])) {
			
		hm.put(3, hm.get(a[i])+1);
	}
		else {
			hm.put(a[i], 1);
		}

	}
	System.out.println(hm);	
}
}
