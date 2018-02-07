import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTitle {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String expected = "Yahoo";
		
		if(pageTitle.equals(expected))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.close();
	}

}
