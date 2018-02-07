import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch2 {

	public static  FirefoxDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter number of strings: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		System.out.println("Enter values: ");
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<n; i++){
			list.add(s.nextLine());
		}
				
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://google.com";
		driver.get(url);
		
		for(int i=0; i<list.size(); i++){
			doSearch(list.get(i));
		}
		
		driver.close();
	}
	
	public static void doSearch(String searchTerm) throws InterruptedException{
		WebElement searchBox = driver.findElement(By.className("gsfi"));
		searchBox.clear();
		searchBox.sendKeys(searchTerm);
		driver.findElement(By.name("btnG")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
	}

}
