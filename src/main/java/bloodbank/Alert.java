package bloodbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//URL
	      driver.get("https://demo.guru99.com/test/delete_customer.php");
	      Thread.sleep(2000);
		
	    //Customerid
	      driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	      Thread.sleep(2000);
	      
	      //submitbutton
	      driver.findElement(By.xpath("//input[@name='submit']"));
	      // Alert :its a small message box which gives information ,warning and asking for permission to 
	      //perform certain kind of action
	      //alert message
	      //confirmation alert
	      System.out.println("confirmation alert message"+driver.switchTo().alert().getText());
	      
	      
	      //CLICK ON BUTTON
	      
	      driver.switchTo().alert().accept();
	      Thread.sleep(2000);
	      //click on cancel button >>driver.switchTo().alert().dismiss());
	      
	      
	      //simple alert
	      System.out.println("confirmation alert message:"+driver.switchTo().alert().getText());
	      driver.switchTo().alert().accept();
	      Thread.sleep(2000);
	      driver.close();
	      
	  }

}
