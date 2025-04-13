package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {

	
	public static void main(String[] args) {
		
		
		//ChromeDriver driver1 = new ChromeDriver();
		//RemoteWebDriver driver2 = new ChromeDriver();
		 WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String pagetitle =driver.getTitle();
		
		if(pagetitle.equals("Google"))
		{
			System.out.println("Test Case Passed");
			
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		driver.quit();
		
	}
}
