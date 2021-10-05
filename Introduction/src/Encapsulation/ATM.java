package Encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank obj= new bank();
		obj.updatePin(123456, 1234, 4567);
		
		obj.withdrawAmount(123456,4567,10000);
		
		//if valid person tries to withdraw amount and he gives correct credentials - case1
		//if someone hacks the ATM and tries to withdraw the amount. he doesnot know the pin but he can set
		//a new pin as shown in line no. 9 and he can withdraw the amount
		

	}

}
