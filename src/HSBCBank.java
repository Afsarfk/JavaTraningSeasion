
public class HSBCBank  implements USBank, BrazilBank { // we are achieving multiple inheritance
	
	//  IS-a relationship
	

	// IF a class is implementing any Interface, then its mandatory to define/override all the mehtods of Interface
	
	
	
	
	// Overriding from USBank
	
	public void credit() {
		
		System.out.println("habc -- credit");	
		
	}
	
	public void debit() {
		System.out.println("hsbc--debit");
	}

	
	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}
	
	// Separate methods of HSBCBank class
	public void eductionLoan() {
		System.out.println("hsbc--edu loan");
	}
	
	public void carLoad() {
		System.out.println("hsbc--Car loan");
	}
	
	//brazil bank method: overriding from BrazilBank
	public void mutualFund() {
		
		System.out.println("hsbc--mutual fund");
	}
	
}



