
public class JavaInterviewmultiply {
	
	//Print multiplication table without multiply operator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = multiply(5,10);
		System.out.println(result);
		

	}
	
	public static int multiply(int i, int j) {
		
		int sum=0;
		int k=1;
		while(k<=j) {
			sum= sum +i;
			k++;
		}
		
		return sum;
	}

}
