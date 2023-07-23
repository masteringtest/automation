package bloodbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skyscanner {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","C:\\Users\\ashi_\\Documents\\bloodbanktoday\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//URL
	      driver.get("http://demoqa.com/alerts");
	      Thread.sleep(2000);
	      
	      //click button to see alert
	      driver.findElement(By.id("alertButton")).click();
	      Thread.sleep(2000);
	      System.out.println("click button to see alert"+driver.switchTo().alert().getText());
	      driver.switchTo().alert().accept();
	      
	    //on button click alert will appare after 5 second 
	      driver.findElement(By.id("timerAlertButton")).click();
	      Thread.sleep(2000);
	      //System.out.println("on button click alert will appare after 5 second "+//
	      driver.switchTo().alert().getText();
	      driver.findElement(By.id("timerAlertButton")).click();
	      driver.switchTo().alert().accept();
//	     
	      
	    //on button click confirm box will appear you selected ok 
	      driver.findElement(By.id("confirmButton")).click();
	      System.out.println("click button to see alert"+driver.switchTo().alert().getText());
	      driver.switchTo().alert().accept();
	      Thread.sleep(2000);
	      
	    //click button to see alert
	      driver.findElement(By.id("promtButton")).click();
	      Thread.sleep(2000);
	     
	      Thread.sleep(2000);
	      driver.switchTo().alert().accept();
	      driver.close();
	      
	      //on button 
	      
	      
	      
	      
	      
	      
	      
	      

	}

}
