package tets;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee {
	
	@Test(dataProvider="dataSupplier")
	public void calTax(String name, int totalSal, double exemptions){
		System.out.println(name+"*"+totalSal+"*"+exemptions);
		int tax = (int) ((totalSal-exemptions)*10/100);
		System.out.println(name+"*"+tax);
	}
	
	@DataProvider
	public Object[][] dataSupplier(){
		
		Object[][] data = new Object[4][3];
		
		data[0][0]= "Venkat";
		data[0][1]= 100000;
		data[0][2]= 70005.50;
		
		data[1][0]= "ABCD";
		data[1][1]= 200000;
		data[1][2]= 140005.50;
		
		data[2][0]= "EFGH";
		data[2][1]= 300000;
		data[2][2]= 220005.50;
		
		data[3][0]= "IJKL";
		data[3][1]= 400000;
		data[3][2]= 380005.50;
		
		return data;
		
	}
	
	
}
