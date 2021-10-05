
public class JavaInterviewPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//11%2=1 we calculate the remainder using this operator
		
		int val=4;
		boolean flag= false;
		for(int i=2; i<val;i++) { //mathematical logic is i need not go up to 11 to check if it is prime no.
			//or not, i can go uptil half of that value i.e. 11/2 which is 5, if the no. doesnot give 
			//remainder zero  then it is prime
			if(val%i==0) {
				 flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("the given no. is Prime");
			
		}else {
			System.out.println("the given no. is not Prime");
			
		}

	}

}
