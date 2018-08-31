
public class TestBank {

	public static void main(String[] args) {
		
		
		System.out.println(USBank.min_bal);
		
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.eductionLoan();
		hs.carLoad();
		
		
		//dynamic polymarphism:
		// Child class object can be referred by parent Interface reference vat
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		
	}

}
