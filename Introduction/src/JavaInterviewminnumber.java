
public class JavaInterviewminnumber {
	
	
//2 4 5
//3 4 7
//1 2 9
  
//program to print min number  from a group of numbers
	
//here i am assuming that the first number a[0][0] is minimum and progressing to check other minimum values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		/*int min=abc[0][0];
		
		for(int i=0;i<3;i++) {
			
			
			for (int j=0;j<3;j++) {
				if(abc[i][j]<min) {
					min = abc[i][j];
				}
			}
		}
		System.out.print(min);
		*/
		
		//program to find max number in array
		int max=abc[0][0];
		
		for(int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
				if(abc[i][j]>max) {
					max=abc[i][j];
				}
			}
		}
		System.out.println(max);
		
		
		

	}

}
