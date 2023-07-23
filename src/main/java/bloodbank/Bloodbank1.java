package bloodbank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Bloodbank1 {

	public static void main(String[] args) throws InterruptedException {
		Select s;
		
		System.setProperty("webdriver..chrome.driver", "C:\\Users\\mail2\\Desktop\\AUTOMATION TESTING\\Browser Extension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);
		
		//Registration Button
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		
		//First Name
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtName")).sendKeys("Arati");
		Thread.sleep(2000);
		
		//Email
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("arati@gmail.com");
		Thread.sleep(2000);
		
		//Mobile Number
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobile")).sendKeys("8637053381");
		Thread.sleep(2000);
		
		//Create PassWord
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLoginPassword")).sendKeys("123456");
		Thread.sleep(2000);
		
		//BloodGroup 
		driver.findElement(By.className("ui-selectmenu-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ui-id-7")).click();
		Thread.sleep(3000);
			
		//Gender as Male
		driver.findElement(By.xpath("//span[@id=\"ctl00_ContentPlaceHolder1_cboGender-button\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"ui-id-10\"]")).click();
		Thread.sleep(2000);
		
		//BirthDate as 19
		s=new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboDobDay\"]")));
		s.selectByIndex(18); 
		Thread.sleep(2000);
		
		
		//BirthMonth as November
		s=new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboDobMonth\"]")));
		s.selectByIndex(10); 
		Thread.sleep(2000);
		 
		//BirthYear as 1997  
		s=new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboDobYear\"]")));
		s.selectByIndex(4); 
		Thread.sleep(2000);
		 
		//Weight as 55
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWeight")).sendKeys("55"); 
		Thread.sleep(2000);
		
	    //Donation Date >> Day 
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboLastDay\"]"))));
		s.selectByIndex(4); Thread.sleep(2000);
		
		//Donation Date >> Month 
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboLastMonth\"]"))));
		s.selectByIndex(2); 
		Thread.sleep(2000);
		 
		//Donation Date >> Year 
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboLastYear\"]"))));
		s.selectByIndex(2);
		Thread.sleep(2000);
		  
		//Show Mobile
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboShowMobile-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-13")).click(); 
		Thread.sleep(2000);
		 
		
		//Show SMS Alert
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboSmsAlert-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-16")).click();
		Thread.sleep(2000);
		
		
		//PinCode
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPinCode")).sendKeys("416001");
		Thread.sleep(2000);
		
		//Select State as Maharashtra
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboState\"]"))));
		s.selectByVisibleText("Maharashtra");
		Thread.sleep(2000);
		
		
		//Select District as Nagpur
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboCity\"]"))));
		s.selectByVisibleText("Nagpur");
		Thread.sleep(2000);
		
		//Select Tehsil as Hingna
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboTeh\"]"))));
		s.selectByVisibleText("Hingna");
		Thread.sleep(2000);
		
		//Enter City or Village
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress")).sendKeys("Nagpur");
				Thread.sleep(2000);
				
				//Check Terms and Conditions
				driver.findElement(By.name("ctl00$ContentPlaceHolder1$chkTerms")).sendKeys("checked");
				Thread.sleep(2000);
			
				
				//SUBMIT button
			     driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")).click();
			     Thread.sleep(2000);
		
	}
		
	
		
	}

		

	


