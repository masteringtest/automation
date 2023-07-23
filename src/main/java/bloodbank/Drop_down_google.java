package bloodbank;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_down_google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//URL
	      driver.get("https://google.com");
	      Thread.sleep(2000);
	      
	      //google search bOX
	      driver.findElement(By.id("APjFqb")).sendKeys("what is selenium");
	      Thread.sleep(2000);
	      
	    //google search button
	      driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
	      Thread.sleep(2000);
	      
	      
	      //way1
	      String expectedtitle="what is selenium?-google search";
	      String actualTitle=driver.getTitle();
	      if(expectedtitle.equals(actualTitle))
	      {
	    	  
	    	  System.out.println("both the title are same");
	    	  
	      }
	      else
	      {
	    	  
	    	  System.out.println("defect");
	    	  
	     }
	      Thread.sleep(2000);
	      
	      driver.close();

	}

}
