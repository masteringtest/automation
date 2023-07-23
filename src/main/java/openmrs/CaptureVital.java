package openmrs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureVital {

	public static void main(String[] args) throws InterruptedException, IOException {

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\automation\\src\\main\\java\\openmrs\\Property.properties");
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Select s;

		// URL
		driver.get(p.getProperty("URL"));
		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Admin123");
		Thread.sleep(2000);

		// For Inpatient Ward

		driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.id("referenceapplication-vitals-referenceapplication-vitals-extension")).click();
		driver.findElement(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody/tr[1]/td[1]/span")).click();

		driver.findElement(By.id("edit-patient-demographics")).click();

		// //
		// driver.findElement(By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")).click();
		driver.findElement(By.name("givenName")).clear();
		driver.findElement(By.name("givenName")).sendKeys("John");
		driver.findElement(By.name("middleName")).clear();
		driver.findElement(By.name("middleName")).sendKeys("Henri");
		driver.findElement(By.name("familyName")).clear();
		driver.findElement(By.name("familyName")).sendKeys("Wanka");
		// driver.findElement(By.id("checkbox-unknown-patient")).click();
		driver.findElement(By.id("next-button")).click();

		// Gender
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section/fieldset[2]/p/select/option[1]")).click();
		driver.findElement(By.id("next-button")).click();

		// Birthdate
		driver.findElement(By.name("birthdateDay")).clear();
		driver.findElement(By.name("birthdateDay")).sendKeys("10");
		s = new Select(driver.findElement(By.name("birthdateMonth")));
		s.selectByVisibleText("July");
		driver.findElement(By.name("birthdateYear")).sendKeys("1995");
		driver.findElement(By.id("next-button")).click();

		// cancel
		driver.findElement(By.id("cancelSubmission")).click();
		Thread.sleep(2000);

		// submit button
		// driver.findElement(By.id("registration-submit")).click();

		// Patient header contact info
		driver.findElement(By.id("patient-header-contactInfo")).click();
		Thread.sleep(2000);
		// show contact info
		//driver.findElement(By.id("coreapps-showContactInfo")).click();
		//Thread.sleep(2000);
//		// edit address
		// driver.findElement(By.className("edit-info")).click();
//        Thread.sleep(2000);
//		driver.findElement(By.id("contact-info-inline-edit")).click();
//		driver.findElement(By.id("contact-info-inline-edit")).click();
//	      Thread.sleep(2000);
//		
//		// Edit addreSS
//		driver.findElement(By.id("address1")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("address1")).sendKeys("kolbenacker 6");
//		Thread.sleep(2000);
//		driver.findElement(By.id("address2")).clear();
//		driver.findElement(By.id("address2")).sendKeys("Near Garden");
//		driver.findElement(By.id("cityVillage")).clear();
//		driver.findElement(By.id("cityVillage")).sendKeys("Adliswil");
//		driver.findElement(By.id("stateProvince")).clear();
//		driver.findElement(By.id("stateProvince")).sendKeys("Zurich");
//		driver.findElement(By.id("country")).clear();
//		driver.findElement(By.id("country")).sendKeys("Switzerland");
//		driver.findElement(By.id("postalCode")).clear();
//		driver.findElement(By.id("postalCode")).sendKeys("526354");
//		driver.findElement(By.id("next-button")).click();
//
//		// save form
//		driver.findElement(By.id("save-form")).click();
//
//		// cancel
//		// driver.findElement(By.id("cancelSubmission")).click();
//
//		// submit button
//		// driver.findElement(By.id("registration-submit")).click();
//
//		// Exit button
//
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"actions\"]/button")).click();
      
	}

}
