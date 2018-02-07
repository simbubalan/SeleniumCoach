import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://naukri.com");
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> ite = set.iterator();
		
		while(ite.hasNext()){
			driver.switchTo().window(ite.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
	}

}
