
public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int [4][3]; //initializing multi dimensional arrays
		//the first bracket [] represents rows or x axis and the second bracket represents columns or y axis
		// so i have 4 rows and 3 columns
		
		a[0][0]=2;
		a[0][1]= 4;
		a[0][2]= 5;
		a[1][0]= 6;
		a[1][1]=5;
		a[1][2]=3;
		a[1][0]= 6;
		a[1][1]=5;
		a[1][2]=3;
		a[2][0]= 5;
		a[2][1]=5;
		a[2][2]=4;
		a[3][0]= 6;
		a[3][1]=7;
		a[3][2]=4;
		
		//System.out.println(a[1][0]);
		
		int b[][]= {{2,4,5},{3,4,7},{5,2,1}}; //this is biend done on the basis of row values.
		//2,4,5 is first row values, {3,4,7} is second row values and so on
		//System.out.println(b[2][1]);
		
		
		// 2 4 5
		// 6 5 3
		// 5 5 4
		// 6 7 4
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.println(a[i][j]);
				
			}
			
		}
		
		
		
		
		

	}

}
