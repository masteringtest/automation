package bloodbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class The_automation_zone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver..driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Select s;
		boolean b;
		driver.manage().window().maximize();
		//URL
	      driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
	      Thread.sleep(2000);
	      s=new Select(driver.findElement(By.xpath("//*[@id=\"mySelect\"]")));
//	      		b=s.isMultiple();
//	      		System.out.println("no of data "+option.size());
//	      		
//	      		
//	      		for(webElement e:option)
//	      		{
//	      			System.out.println(e.gettext());
//	      			
//	      		}
//	      		System.out.println("\n\n----------------------------------------");
//	      		//webElement dropdown2=driver.findElement(by.xpath("//*[@id=\"cars\"));
//	      				s=new Select(dropdown2);
//	      				b=s.isMultiple();
//	      				System.out.println("MULTISELCETED DROP DOWN"+b);
//	      				
//	      				
//	      				//no of data 
//	      				//data
//	      				s.selectByIndex(0);
//	      				s.selectByValue("saab");
//	      				s.selectByIndex(2);
//	      				//s.selectByAll();
	     
	      
	}

}
