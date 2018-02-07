
public class HDFCBank implements CashBank, HomeLoanBank{

	@Override
	public void doLogin() {
		System.out.println("HDFC Login");
	}

	@Override
	public void doBalTF() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Bal TF");
	}

	@Override
	public void doLogOut() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Log out");
	}

	@Override
	public void issueLoan() {
		System.out.println("Issueing Home loan");
	}

	

}
