package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeHrms {

	
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	    //driver.findElement(By.partialLinkText(" Inc")).click();
	    driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
	}    
}
