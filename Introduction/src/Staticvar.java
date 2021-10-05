
public class Staticvar {
	
	// the variables below are global/instance variables
	
	//instance variables are tied up to the object and thats the reason local variables are 
	//assigned instance variable values
	
	
	String name;  // here in this example name and address are instance variables
	static String city = "Bangalore"; //all static variables are class variables and remaining variables defined 
	// in class are instance variables 
	String address;
	static int i =0;
	
	
	Staticvar(String name,String address){ // these three are local variables. the scope of these
		//variables is inside this block only
		
		// our aim is to assign these local variables to instance variables
		this.name=name; //this refers to current class instance or instance variable present in the class
		
		this.address=address;
		i++;
		System.out.println(i);
		
		
	}
	
	public void getAddress() {
		System.out.println(address+" "+ city);
		
		
		
	}

	public static void main(String[] args) {  // objects can be created only inside the main method
		// TODO Auto-generated method stub
		
		Staticvar obj = new Staticvar("Bob","Marathaalli");
		
		Staticvar obj1= new Staticvar("Ram","Jayanagar");
		obj.getAddress();
		obj1.getAddress();
		
		//we are making census report in bangalore. what is the point of having city name for every object
		//since the city name doesnt change, it is constant
		
		
		//at runtime java creates memory for address, name,city whenever we create an object.
		//why not create one variable in memory which is shared among all objects.
		
		//to make a common data across all objects, we have to use keyword called static.
		
		//whenever any variable is static, then that variable copy is shared by all the objects and we can get 
		//rid of extra data bangalore which we are giving in every object
		
		
		
		
	
				
				
			

	}

}
