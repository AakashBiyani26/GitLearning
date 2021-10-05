
public class CarPriceEstimator {
	
	
	public void CalculateCurrentPrice(int age, double OriginalPrice, int airbag, boolean ABS, boolean EBD, boolean RVC, boolean SRoof, boolean AC ) {
		
		double Price;
		
		if(age<=10) {
			
			for (int i=1;i<=age;i++) {
				
				Price = OriginalPrice - 0.05*OriginalPrice;
				
				OriginalPrice=Price;
				
				
			}
			
			int ComfortPrice = ComfortFeatureAddAmount();
			
			Price = Price + ComfortFeatureAddAmount() - SecurityFeatureAmountDed();
			
			
		}
		
		
	}
	
	public int SecurityFeatureAmountDed(int airbagcount, boolean abs, boolean ebd) {
		
		int PriceSecurityDed;
		
		if(airbagcount>=2 && abs==true && ebd==true) {
			PriceSecurityDed=0;
		}else {
			PriceSecurityDed = 1000;
		}
		
		return PriceSecurityDed;
		
	}
	
	public int ComfortFeatureAddAmount(boolean RearViewCamera, boolean sunroof, boolean AutoAC) {
		
		int ComfortFeaturePrice;
		
		if(RearViewCamera==true && (sunroof==true || AutoAC==true)) {
			ComfortFeaturePrice=500;
		}
			else {
				ComfortFeaturePrice=0;
			}
		return ComfortFeaturePrice;
			
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
