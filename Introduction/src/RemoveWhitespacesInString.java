
public class RemoveWhitespacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Java Programming selenium automation" ;//want to remove the whitespaces between the words
		System.out.println("Before removing the whitespaces :"+ str);
		str =str.replaceAll("\\s", "");	//"\\s" i am writing a regular expression and this matches with spaces and wherever spaces
		//occur in the string we are replacing it with nothing
		System.out.println("After removing the whitespaces :"+ str);
		

	}

}
