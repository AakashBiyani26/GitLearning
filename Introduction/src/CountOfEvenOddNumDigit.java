
public class CountOfEvenOddNumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n=1234568;
		int counteven=0;
		int countodd=0;
		
		while(!(n==0)) {
			
			int p= n%10;
			n=n/10;
			
			if(p%2==0) {
				counteven++;
			}
			else {
				countodd++;
			}
			
		}
		
		System.out.println("Count of even nos. is:"+ counteven);
		System.out.println("Count of even nos. is:"+ countodd);
		

	}

}
