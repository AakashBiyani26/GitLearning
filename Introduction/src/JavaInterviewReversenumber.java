import java.util.Scanner;

public class JavaInterviewReversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		//Java Scanner class allows the user to take input from the console. It belongs to java.util package. It is used to read the input of primitive types like int, double, long, short, float, and byte. It is the easiest way to read input in Java program.

//Syntax
//Scanner sc=new Scanner(System.in);  
//The above statement creates a constructor of the Scanner class having System.inM as an argument.
//It means it is going to read from the standard input stream of the program. The java.util package should be import while using Scanner class.

//It also converts the Bytes (from the input stream) into characters using the platform's default charset.

		System.out.println("Enter a Number");
		int num=sc.nextInt(); //using scanner object to get the value from the user. nextInt method will accept 
		//the value from the user and then store the value which is number (int) in num variable.
		
		
		//ways of reversing  :1) Using algoritm
		/*int rev=0;
		while(num!=0) {
			rev= rev*10 +num%10; //0+1234%10=4; 40+3=43; 430+2=432; 4320+1=4321
			num= num/10; //1234/10=123; 123/10=12; 12/10=1; 1/10=0;
			
			
		}
		System.out.println("Reverse Number is:"+ rev);
		*/
		
		
		//2) Using string buffer class method
		StringBuffer rev;  //reverse variable is string buffer type
		StringBuffer sb= new StringBuffer(String.valueOf(num));//String.valueof will convert our number into 
		//string format
		rev=sb.reverse();
		System.out.println("Reverse Number is:"+ rev);
		
		
		
		
		
		
		
	}

}
