package bloodbank;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BloodBank {

	public static void main(String[] args) throws InterruptedException {
		// Set System Properties:
		System.setProperty("webdriver..driver",
				"C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Select s;
		Thread.sleep(2000);

		// Maximize Window:
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// URL:
		driver.get("https://bloodbanktoday.com/bloodbank");
		Thread.sleep(2000);

		// Blood Bank Module:
		driver.findElement(By.linkText("BLOOD BANK")).click();
		Thread.sleep(2000);

		// Scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Way 1: Using Pixel
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);

		// Select State:
		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboState\"]")));
		s.selectByVisibleText("Maharashtra");
		Thread.sleep(2000);

		// Select District:
		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboCity\"]")));
		s.selectByVisibleText("Pune");
		Thread.sleep(2000);

		// Search Button:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]")).click();
		Thread.sleep(3000);

		// Home Option:
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);

	}

}
