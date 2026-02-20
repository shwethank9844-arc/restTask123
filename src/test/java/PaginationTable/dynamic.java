package PaginationTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dynamic {
	@Test
	public void task3() throws InterruptedException {
		
		String name="Chrome";
		 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 
    	 driver.get("https://testautomationpractice.blogspot.com/");
    	 
    	 Actions act=new Actions(driver);
    	    
     	
     	 Thread.sleep(3000);
     	
     	 act.scrollByAmount(0, 2000).perform();
     	 Thread.sleep(2000);
     	 
     	 
      String value = driver.findElement(By.xpath("//table[@id='taskTable']//tr//td[.='"+name+"']/following-sibling::td[contains(text(),'%')]")).getText();
     	System.out.println(value);
     	System.out.println(value);
     	System.out.println(value);
	}
}
