
public class WhileDemo {

	public static void main(String[] args) {
		WhileDemo obj = new WhileDemo();
//		isLeapYear(2001);
//		isLeapYear(2002);
//		isLeapYear(2003);
//		isLeapYear(2004);
//		isLeapYear(2005);
//		isLeapYear(2006);
//		isLeapYear(2007);
//		isLeapYear(2008);
		
		int y = 2001;
		int count = 0;
		
		while(y<=2100){
			
			if(obj.isLeapYear(y))
				count++;
			
			y=y+1;
		}	
		
		System.out.println(count);
	}
	
	public boolean isLeapYear(int year){
		
		if(year%400==0)
			return true;
		else if((year%4==0)&&(year%100!=0))
			return true;
		else
			return false;
	}

}
