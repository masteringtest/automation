package bloodbank;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Blogs {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver..driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		         //URL
		          driver.get("https://bloodbanktoday.com/");
		          Thread.sleep(2000);
				
				// Maximize Window:
				driver.manage().window().maximize();
				Thread.sleep(2000);
								
				//driver.findElement(By.linkText("BLOGS")).click();
				driver.get("https://bloodbanktoday.com/blogs");
				Thread.sleep(2000);
				
				// Read More:
				driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UpdatePanel1\"]/div/div/div[1]/div[1]/div/div[3]/div/div/a")).click();
				Thread.sleep(2000);
				
				// Scroll
				JavascriptExecutor js = (JavascriptExecutor)driver;
				Thread.sleep(2000);
					
				// Till Bottom
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(2000);
						
				// Scroll Up
				js.executeScript("window.scrollTo(0, 0)");
				Thread.sleep(2000);
				
				
				

//				
//				
			}
            }



