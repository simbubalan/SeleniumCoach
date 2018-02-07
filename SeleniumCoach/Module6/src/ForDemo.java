
public class ForDemo {

	public static void main(String[] args) {
		LeapYearClass obj = new LeapYearClass();
	
		int count=0;
		
		for(int year=2001; year<=2100; year++){
			if(obj.isLeapYear(year))
				count = count+1;
		}
		
		System.out.println("Total Leap years are: "+count); 		
	}
}
