
public class ReverseStringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "madam";
		String t= "";
		//Palindrome string is a string where after reversing the string the string is same
		//like after reversing madam it is the same madam. rahul is not a palindrome. the reverse
		//gives luhar
		for (int i=s.length()-1;i>=0;i--) {
			t=t + s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(t)) {
			System.out.println(s + "the string is palindrome");
		}else {
			System.out.println(s + "the string is not palindrome");
			
		}

	}

}
