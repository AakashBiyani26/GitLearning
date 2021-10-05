
public class InterviewFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0 1 1 2 3 5 8 13 21 34 
		
		//sum of 2 adjacent nos. equals third number
		
		
		int a = 0;
		int b= 1;
		int sum=0;
		int i=1;
		while (i<9) {
			sum= a+b;
			System.out.println(sum);
			
		//b should become a and sum should become b i.e. q equals b value and b  equals sum value
			a=b;
			b=sum;
			i++;
			
			
		}
		
		
	}

}
