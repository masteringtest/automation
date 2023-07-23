package bloodbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Home {

	public static void main(String[] args) throws InterruptedException {
		// set system property
		System.setProperty("webdriver..driver",
				"C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Select s;
		Thread.sleep(2000);
		// Maximize Window:
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// URL:
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);

		// Blood Group:
		driver.findElement(By.cssSelector("span[class='ui-selectmenu-text']")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]")).click();
		Thread.sleep(2000);

		// Select State:
		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboState\"]")));
		s.selectByVisibleText("Maharashtra");
		Thread.sleep(2000);

		// Select District:
		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboCity\"]")));
		s.selectByVisibleText("Pune");
		Thread.sleep(2000);

		// All Tehsil:
		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboTeh\"]")));
		s.selectByVisibleText("Pune City");
		Thread.sleep(2000);

		// Find Blood:
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]")).click();
		Thread.sleep(2000);

	}

}
