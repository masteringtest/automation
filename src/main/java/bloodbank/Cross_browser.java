package bloodbank;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cross_browser {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		WebDriver driver=null;
		switch(choice)
		
		{
		case 1:
			System.out.println("welcome to google chrome");
			System.setProperty("webdriver..chrome.driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
			driver = new ChromeDriver();
		
		
		case 2	:
			
			System.out.println("welcome to firefox");
			System.setProperty("webdriver..gecko.driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		    driver = new ChromeDriver();
		    break;
		    default:
		    	System.out.println("invalid input");
		       }
		
		driver.get("https:/www.amazon.com");
		driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[23]")).sendKeys(Keys.ENTER);
	}
        
}
