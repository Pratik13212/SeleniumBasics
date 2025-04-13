package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLogin {
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    driver.manage().window().maximize();

	    WebElement email = driver.findElement(By.id("input-email"));
	    
	    Thread.sleep(3000);
	    email.sendKeys("Pratik.kadam70@gmail.com");
	    
	    
	    //ZJVfxB@5Xc4RiM
	    Thread.sleep(3000);
	   WebElement password= driver.findElement(By.id("input-password"));
	   password.sendKeys("ZJVfxB@5Xc4RiM");
		
	   WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
	   
	   loginButton.click();
	   
	   

	   
	   
	   
		
		
		
		
		
		
		
		
	}

}
