package sms;

import org.testng.annotations.DataProvider;

public class DataClass {
	@DataProvider
	public static Object[][] mobileData(){

		Object[][]  data = new Object[3][2];
		data[0][0] = "8309386750";
		data[0][1] = "SMS1";

		data[1][0] = "8309386750";
		data[1][1] = "SMS2"; 


		data[2][0] = "8309386750";
		data[2][1] = "SMS3";

		return data;
	}
}
