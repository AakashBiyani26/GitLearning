
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=543;
		int reverse= 0;
		while(a!=0) {
			int digit = a%10;
			reverse= digit + reverse*10; //3 //43
			a=a/10;  //new a value i.e. 54
			
		}
		System.out.println(reverse);

	}

}
