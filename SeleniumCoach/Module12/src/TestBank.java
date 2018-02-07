
public class TestBank {

	public static void main(String[] args) {
		/*ICICIBank obj = new ICICIBank();
		obj.doLogin();
		obj.doBalTF();
		obj.doLogOut();
		
		HDFCBank obj2 = new HDFCBank();
		obj2.doLogin();
		obj2.doBalTF();
		obj2.doLogOut();*/
		//Bank obj = new Bank();
		CashBank obj = null;
		
		String bankName = "hdfc";
		
		if(bankName.equalsIgnoreCase("hdfc"))
			obj = new HDFCBank();
		else if(bankName.equalsIgnoreCase("icici"))
			obj = new ICICIBank();
		
		obj.doLogin();
		obj.doBalTF();
		//obj.issueLoan();
		obj.doLogOut();
		
	}

}















