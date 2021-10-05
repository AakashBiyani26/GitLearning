
public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1234; //int (integer data type) can store value only upto 10 digits while long data type
		//can store integer value upto any n number of digits
		float f= 123.4f; // with float we need to suffix f whenever we assign the value. float is for decimal
		//datatypes
		long l= 123456781011l; // we have to suffix l after the value we have entered.
		double d = 123.456789101112; //double can have longer value for decimals than float datatype.
		//no need of suffix in double.
		boolean b = false; // boolean only stores value in either true or false
		char c = 'a'; //character stores only one value like a and if i need more than 1 value, i will 
		// store in string
		String s = "this is a java tutorial";
		// assigning values to datatypes or variables is called as initialization.
		
		//to make the code or variables more readable we use camel casing.
		//Example below --
		int theBatmanBegins;
		int theDarkKnight;
		int theDarkKnightRises;
		// here after every word we have used upper case/capital letter to start a new word like theDarkKnight
		//camel casing makes the code more readable
		String abc= new String();
		abc="Hello";
		
		String abc1 = "hello";
		// in both examples of initializing string with values we are creating an instance variable and
		//instantiating.
		String s1= "way";
		String s2="2"; // even a number can be given in string
		String s3="Automation";
		String s4= s1+ "  kjk  "+ s2+s3;
		//System.out.println(s4);
		//System.out.println(s1+s2+s3);
		System.out.println("Way"+"2"+"Automation");
		
		
		
		
		

	}

}
