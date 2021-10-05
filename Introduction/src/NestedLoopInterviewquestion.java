
public class NestedLoopInterviewquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//program to print nos. in below format (Printing pyramid triangle)
		//1 2 3 4
		//5 6 7 
		//8 9
		//10
		 int k =1;
		 for(int i=0;i<=4;i++) {
			 
			   for(int j=1;j<=4-i;j++) {
				   System.out.print(k); //ln means to print in next line or seperate lines
				   System.out.print("\t"); //this will give space
				   
				   k++;
				   
			   }
			   //i want to start next line after printing a set of nos.
			   System.out.println("");
		 }
		 
		 
		 //program to print nos. in below format (Inverse sequence pyramid logic)
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		
		 
		 /*int k =1;
		 for (int i=1;i<5;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 System.out.print(k);
				 System.out.print("\t"); //this will give space
				 k++;
			 }
			 System.out.println(" ");
		 }
		 */
		//program to print nos. in below format
		 //1
		 //1 2
		 //1 2 3
		 //1 2 3 4
/*for (int i=1;i<5;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
				 System.out.print("\t"); //this will give space
				 
			 }
			 System.out.println(" ");
		 }
		 */

//program to 
		 

	}

}
