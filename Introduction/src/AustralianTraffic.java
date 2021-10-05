
public class AustralianTraffic implements CentralTraffic,continentTraffic{
	
	//One class can implement more than one Interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new AustralianTraffic();
		//this line says that an object is created for this class to implement methods present in CentralTraffic
		
		a.redstop();
		a.Flashyellow();
		a.greengo();
		//a.walksymbol() i cannot use this method here with a object as that method is not defined in Interface
		AustralianTraffic at = new AustralianTraffic();
		at.walksymbol();
		continentTraffic ct = new AustralianTraffic();
		ct.Trainssymbol();

	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		//code in these bodies
		System.out.println("Green go implementation");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void Flashyellow() {
		// TODO Auto-generated method stub
		
		System.out.println("Flashyellow implementation");
		
	}
	
	
	//methods specific to Australian rules
	public void walksymbol() {
		System.out.println("Walking");
		
	}

	@Override
	public void Trainssymbol() {
		// TODO Auto-generated method stub
		
	}

}
