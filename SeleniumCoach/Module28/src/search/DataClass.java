package search;

import org.testng.annotations.DataProvider;

public class DataClass {
	@DataProvider
	public static Object[][] searchData(){

		Object[][]  data = new Object[3][1];
		data[0][0] = "Selenium";
		data[1][0] = "UFT";
		data[2][0] = "Mobile";

		return data;
	}
}
