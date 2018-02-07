package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InterestCalculator {
	@Parameters({"prinicipleAmnt","timeInYears","rateOfInterest"})
	@Test(priority=1)
	public void calculate(int priAmnt, double time, String roiVal){
		roiVal = roiVal.substring(0, roiVal.length()-1);
		int roi = Integer.parseInt(roiVal);
		
		double interestAmount = (priAmnt*time*roi)/100;
		double total = interestAmount+priAmnt;
		System.out.println(total);
	}
	
	@Parameters({"rateOfInterest", "timeInYears"})
	@Test(priority=2)
	public void display(String roiVal, double time){
		System.out.println(roiVal+"*"+time);
	}
}
