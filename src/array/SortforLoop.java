package array;

public class SortforLoop {
	public static void main(String[] args) {
		int[] a= {3,4,9,22,1,5,6,7,5,};
		for(int i=0; i<=a.length-1; i++) {
			for(int j=i+1; j<=a.length-1; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+",");
		}
		
		
		
		
		
		
	}		
}
