package bloodbank;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {

		Select s;
		System.setProperty("webdriver..driver",
				"C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// URL
		driver.get("https://bloodbanktoday.com");

		// Registration button
		driver.findElement(By.linkText("REGISTER")).click();

		// FIRST NAME
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtName")).sendKeys("Pooja");
		// ("ct100_ContentPlaceHolder1_txtName")).sendKeys("Pooja");

		// email
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("Pooja@gmail.com");

		// mobile
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobile")).sendKeys("9607080499");

		// create password
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLoginPassword")).sendKeys("pooja123");

		// blood group
		driver.findElement(By.className("ui-selectmenu-text")).click();
		Thread.sleep(1000);// (hidden element is not clickable display: none;
		driver.findElement(By.id("ui-id-5")).click();
		Thread.sleep(1000);

		// Gender
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboGender-button\"]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-11")).click();
		Thread.sleep(1000);

		// Birthdate

		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboDobDay\"]")));
		s.selectByIndex(11);

		// Month
		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboDobMonth\"]")));
		s.selectByIndex(6);

		// Year
		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboDobYear\"]")));
		s.selectByValue("1992");

		// Weight
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWeight")).sendKeys("60");

		// Last donation date
		s = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboLastDay")));
		s.selectByValue("5");

		// donation month
		s = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboLastMonth")));
		s.selectByValue("Mar");

		//// last donation year
		s = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboLastYear")));
		s.selectByValue("2017");

		// show mobile

		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboShowMobile-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-14")).click();
		Thread.sleep(1000);

		// sms alert
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboSmsAlert-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-15")).click();
		Thread.sleep(1000);

		// pin/zip code
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPinCode")).sendKeys("411036");

		// state
		s = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboState")));
		s.selectByValue("2");

		// district
		s = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboCity")));
		// s.selectByIndex(26);
		s.selectByVisibleText("Pune");

		Thread.sleep(1000);
		// tehsil
		s = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboTeh")));
		s.selectByVisibleText("Pune City");

		// city vilage
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress")).sendKeys("Pune");

		// accept term and condition
		// First Find checkbox
		WebElement chckbox = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkTerms"));
		// Check if checkbox is selected
		boolean islected = chckbox.isSelected();
		// if not selected then select or do nothing
		if (!islected) {
			chckbox.click();
		}

		// open term and condition
		driver.findElement(By.linkText("Terms & Condition")).click();

		// Get all the open tabs using WindowHanlder
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// Swith to parent tab
		driver.switchTo().window(newTb.get(0));
		Thread.sleep(1000);

		// Click on submit button
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")).click();
		// storing web page title

	}

}
