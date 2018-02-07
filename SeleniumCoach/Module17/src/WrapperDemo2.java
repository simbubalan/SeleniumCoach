
public class WrapperDemo2 {

	public static void main(String[] args) throws Exception {
		String duration = "2000";
		Long l = Long.parseLong(duration);
		
		System.out.println("A");
		Thread.sleep(l);
		System.out.println("B");
	}

}
