package collectionFremnworkMap;
//3---->3
//5----->1
//33---->1
//55--->1
//11---->2

import java.util.HashMap;

public class Frequency {
public static void main(String[] args) {
	int[] a= {3,5,33,3,55,3,11,11};
	//key-number
	//value-occurrence
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	
	for(int i=0; i<a.length; i++) 
	{
		
		if(hm.containsKey(a[i])) 
		{
			hm.put(a[i], hm.get(a[i])+1);
		}
		else
		{
			hm.put(a[i], 1);
		}
		
	}
	System.out.println(hm);
	
}
}
