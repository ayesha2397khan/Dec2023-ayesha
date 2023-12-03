package array;

public class MultiDimentionalArray {
public static void main(String[] args) {
	                //0       //1         //2
	int[][] a= {{1,2,3},{1,2,3,4},{1,2,3,4,5}};
	System.out.println(a[2][4]); //5
	System.out.println(a.length);
	System.out.println(a[1].length);
	//2 approach
	int [][] b=new int[2][3];
	b[0][0]=1;
	b[0][1]=2;
	b[0][2]=3;
	b[1][0]=1;
	b[1][1]=2;
	b[1][2]=3;
	for(int i=0; i<=b.length-1;i++) {       //row
		
		for(int j=0; j<=b[i].length-1; j++) {     //column
			
			System.out.print(b[i][j]+",");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
}
