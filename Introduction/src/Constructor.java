
public class Constructor {
	
	public Constructor()
    {
   	 System.out.println("constructor should get executed ");
   	 
   	 
    }
	
	
	public Constructor (int a , int b)
	{
		int c = a + b;
		System.out.println(c);
	}
	 public Constructor (String str)
	 {
		 System.out.println("str");
	 }
	
    
    public void getdata()
    {
   	 System.out.println("I am the method");
   	 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor is a block of code whenever an object is created.
		// constructor executes a block of code whenever an object is created. constructor is 
		// invoked when an object is created. the difference between constructor and method is
		// constructor doesnot return any values.
		//name of constructor should be always class name only.
		
		//Constructor c = new Constructor("Hello");
	    Constructor cd= new Constructor(4,5);
	// even without calling the Constructor, the code in the constructor got executed.block of
		// code will get executed when the object is created
		
		//while executing at runtime it will execute the default constructor since the object created 
		// doesnot have parameters passed
	    
	    //if the object created calls the paremeterized constructor, then default constructor would not be called
		
		
		
     
	}

}
