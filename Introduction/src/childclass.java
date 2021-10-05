
public class childclass extends parentclass {
	
	public void audiosystem()
	{
		System.out.println("new audio system in Child");
	}
	
	public void engine ()
	{
		System.out.println("new engine");
		
	}
	
	public void colour ()
	{
		System.out.println(colour);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		childclass cd = new childclass();
		cd.colour();
		cd.brakes();
		cd.audiosystem();
		
		// here i have audio system method defined in child class and in parent class with same name and
		//same parameters
		//if i run the code it picks up the audiosystem method in child class and audiosystem method has overridden
		//audiosystem method in parent class
		//diff in method overriding and method overloading - in overriding there is no diff in both methods used in method
		//method overloading(audiosystem). method name is same, argument datatype is same, no. of arguments is same.
		
		
		
		//Method Overriding -
		
		

	}

}
