package PaginationTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class Pagination_Test1 {

     @Test
	public void test1() throws InterruptedException {
		
    	 String Expect="E-Reader";
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 
    	 driver.get("https://testautomationpractice.blogspot.com/");
    	 
    	
    	Actions act=new Actions(driver);
    
    	WebElement table = driver.findElement(By.xpath("//h2[.='Pagination Web Table']"));
    	 Thread.sleep(3000);
    	
    	 act.scrollByAmount(0, 3000).perform();
    	
    	
    	
    	for(; ;) {
    		 
    		 
    		try {
    			WebElement actual = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td[.='"+Expect+"']"));
    			if(actual.equals(Expect))
                     // driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr")).click();
                    break; 
    		}
    		catch(Exception e) {
    			  driver.findElements(By.xpath("//ul[@class='pagination']/li"));
    			
    		
                     
    	          }
    		
    	
	}

     }
}
