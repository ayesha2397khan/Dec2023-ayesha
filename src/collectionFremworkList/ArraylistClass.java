package collectionFremworkList;
//order of insertion is mentaine
//duplicate are allowed
//any no of null value
//Arraylist Not good for data manipulation bcoz add data in middle so sequence is data is changed
import java.util.ArrayList;

public class ArraylistClass {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("ayesha");
	al.add("khan");
	al.add(987654321);
	al.add(null);
	al.add(99.23);
	al.add('A');
	al.add(null);
	al.add(null);
	al.add(true);
	al.add("khan");
	al.add("Aspire");
	System.out.println(al);
	al.remove(6);
	al.remove(6);
	System.out.println(al);
	al.set(7,23.54);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.indexOf("khan"));
	System.out.println(al.lastIndexOf("khan"));
	int a=10;
	int b=(int)al.get(2);
	int sum=a+b;
	System.out.println(sum);
	System.out.println(al.get(5));
	for(Object temp:al) {
		System.out.print(temp+",");
	}
	System.out.println();
	for(int j=0;j<al.size();j++) {
		System.out.print(al.get(j)+",");
	}
}
}
