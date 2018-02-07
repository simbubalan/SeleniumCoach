
public class LeapYearDemo {

	public static void main(String[] args) {
		int year = 2100;
		
		//should be divisible 4
		//if it is century year, divisible by 400 
		if(year%400==0)
			System.out.println("Leap year");
		else if((year%4==0)&&(year%100!=0))
			System.out.println("Leap year");
		else
			System.out.println("Normal Year");
	
		System.out.println("Out of if-else ladder");	
		
	}

}
