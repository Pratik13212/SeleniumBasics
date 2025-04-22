package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;



public class CheckBox2 {

	
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://formstone.it/components/checkbox/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox-3']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", checkbox);
		Thread.sleep(3000);
		boolean isenable = checkbox.isEnabled();
		if (isenable== true)
		{
			System.out.println("Checkbox is enable");
		}
		
		{
			System.out.println("Checkbox is disable");
		}
	   
	    
		
		
	}    
}
