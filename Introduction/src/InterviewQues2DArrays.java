
public class InterviewQues2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 2 4 5
		// 3 0 7
		// 1 2 9
		
		
		//Step 1 : Find the minimum number
		//Step 2: Identify the column of minimum number
		//Step 3: find the maximum number in identified column
		
		int abc[][] = {{2,4,5},{3,7,7},{1,2,9}};
		int min= abc[0][0];
		
		int mincolumn = 0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				 if(abc[i][j]<min) {
					 min= abc[i][j];
					 mincolumn= j;
					 
				 }
			}
		}
		
		int max= abc[0][mincolumn];
		int k=0;
		while(k<3) {
			if(abc[k][mincolumn]>max) {
				max= abc[k][mincolumn];
			}
			k++;
			
		}
		
		System.out.println("the Max number in the column is: " + max);
		

	}

}
