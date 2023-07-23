package bloodbank;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DonateUs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// URL:
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);
		
		
		// Maximize Window:
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		
		// Donate Us:
		driver.get("https://bloodbanktoday.com/donate");
		Thread.sleep(2000);
		
		// Scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
								
		// Way 2: Till WebElement
		WebElement w = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/section/div/div/div[3]/h1"));
		js.executeScript("arguments[0].scrollIntoView();",w);
		Thread.sleep(2000);
		
		// Select Amount Rs. 5000:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_rbtAmount\"]/tbody/tr/td[5]/label")).click();
		Thread.sleep(2000);
		
		// Enter Full name:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtName\"]")).sendKeys("Pooja Shrivastava");
		Thread.sleep(2000);
		
		// Enter Email:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtEmail\"]")).sendKeys("pooja.12shri@gmail.com");
		Thread.sleep(2000);
		
		// Enter Mobile Number:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtMobile\"]")).sendKeys("9607080499");
		Thread.sleep(2000);
		
		// Country:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtCountry\"]")).sendKeys("India");
		Thread.sleep(2000);
		
		// State:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtState\"]")).sendKeys("Maharashtra");
		Thread.sleep(2000);
		
		// City:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtCity\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		
		// Pin/Zip code:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtPinCode\"]")).sendKeys("411036");
		Thread.sleep(2000);
		
		// Address:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtAddress\"]")).sendKeys("Konark Riva,Flat no 605,Keshav Nagar,Pune");
		Thread.sleep(2000);
		
		// Hide Name:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboDisplayType-button\"]/span[2]")).click();	
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
		Thread.sleep(2000);
		
		// Donate Now:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]")).click();
		
	}
	
	}


