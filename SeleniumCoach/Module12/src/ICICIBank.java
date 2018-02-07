
public class ICICIBank implements CashBank{

	@Override
	public void doLogin() {
		System.out.println("ICICI Login");
		
	}

	@Override
	public void doBalTF() {
		System.out.println("ICICI BalTF");		
	}

	@Override
	public void doLogOut() {
		System.out.println("ICICI Logout");
		
	}
	
}
