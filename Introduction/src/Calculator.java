
public class Calculator {

	public int getSum(int num1,int num2) {
		int result= num1+num2;
		return result;
	}
	public int getSub(int num1, int num2) {
			int result= num1-num2;
			return result;	
	}
    
	public int getMult(int num1, int num2) {
		int result= num1*num2;
		return result;
	}
		

	public int getDiv(int num1,int num2) {
		int result= num1/num2;
		return result;
	}
	public static void main(String[] args) {
		Calculator c= new Calculator();
		int a = c.getSum(4, 2);// (4,2) are the arguments or values passed to the parameters defined 
		// in getSum method. these arguments are stored in parameters of the method
		System.out.println(a);
		// Parameters vs arguments
		System.out.println(c.getMult(5, 2));
	}
	}