package PaginationTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonTask {

	@Test
	public void task() throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 
    	 driver.get("https://www.amazon.in/");
    	 Actions act=new Actions(driver);
    	 
    	 
    	 WebElement ele = driver.findElement(By.xpath("//div[@id='icp-nav-flyout']/descendant::button[@aria-label='Expand to Change Language or Country']"));
    	 Thread.sleep(2000);
    	 act.moveToElement(ele).click().perform();
    	 
    	  List<WebElement> eles = driver.findElements(By.xpath("//div[@id='nav-flyout-icp']/descendant::ul/li/a/span/i"));
    	  for(WebElement win:eles) {
    		  win.click();
    	  }
	}
	
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
     	 
     	 
      String value = driver.findElement(By.xpath("//table[@id='taskTable']//tr//td[.='"+name+"']/following-sibling::td[contains(text(),'%')]")).getText();
     	System.out.println(value);
	}
}
