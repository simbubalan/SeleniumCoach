public class MethodDemo {

	public static void main(String[] args) {
		isLeapYear(2016);
		isLeapYear(2017);
		isLeapYear(2300);
		isLeapYear(2400);
		isLeapYear(2500);
		isLeapYear(3000);
	
	}
	
	public static void isLeapYear(int year){
		
		if(year%400==0)
			System.out.println(year+" is Leap year");
		else if((year%4==0)&&(year%100!=0))
			System.out.println(year+" is Leap year");
		else
			System.out.println(year+" is Normal Year");
	}
}
