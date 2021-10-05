
public interface CentralTraffic {
	
	
	public int a = 4;
	int b = 2; //even if we dont give access modifier it is treated as public 
	public void greengo();
	public void redstop();
	public void Flashyellow();
	
	
	//These methods are not implemented and only classes can go ahead and implement these methods
	
	//Interface lies on the same line of Class – not big difference between two and only difference is Interface will have methods but not a body.
	//In class I can write code inside method but in interfaces I can only define signature of the method but not code inside the method.
	//Application : If every country has their own traffic rules but there is a common centralized rule which should be followed by all countries in the world.
	//Green – you should move
	//Red – you should stop
	//Yellow – you should be carefull
	//There is some base rule which should be followed by all countries in world. The central team will define interface and write these three methods inside it and they will ask us to implement 
	//These methods in your class. There will be an agreement between client interface and class to implement these methods in the Interface.
	//But in interface these methods are just signatures, so classes should define and implement methods present in Interface.
	//Only classes implement the methods present in Interface

	
	

}
