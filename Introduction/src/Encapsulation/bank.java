package Encapsulation;

public class bank {
	public int accountNo=123456;
	
	//public int pinNo= 1234; here we need to implement encapsulation and in order to implement encapsulation
	//we will make the variable private
	private int pinNo=1234;
	
	private double balanceAmount = 10000;
	
	public void withdrawAmount(int accNo, int pin, int amount) {
		
		if(accNo==accountNo && pin==pinNo) {
			if(amount<=balanceAmount) {
				balanceAmount=balanceAmount-amount;
				System.out.println("Amount withdrawal :"+ amount);
				
			}else
			{
				System.out.println("Insufficient balance ");
			}
			
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}

	public int getPinNo() {
		return pinNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	
	//we are going to create a method where we can update the pin code
	
	public void updatePin(int accNo,int oldPin, int newPin) {
		if(accNo==accountNo && oldPin==pinNo) {
			pinNo=newPin;
			System.out.println("Pin changed successfully");
			
		}
		else {
			System.out.println("Invalid Credentials");
			
		}
	}
	
	public double Depositcash(int accNo,int pin,double amount) {
		if(accNo==accountNo && pin==pinNo) {
			balanceAmount=balanceAmount+amount;
			return balanceAmount;
		}else {
			System.out.println("Invalid Credentials");
			return balanceAmount;
		}
	}

}
