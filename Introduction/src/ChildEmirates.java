
public class ChildEmirates extends ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.safetyGuideline();
		c.bodyColor();
		//we cannot create an object of a class that is abstract
		
		
		

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on body");
		
	}

}
