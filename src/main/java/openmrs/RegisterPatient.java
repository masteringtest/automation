package openmrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPatient {

	public static void main(String[] args) throws IOException, InterruptedException {
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

		// login

		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("Registration Desk")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		// Register a patient

		// NAME

		driver.findElement(By.xpath(
				"//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]"))
				.click();

		driver.findElement(By.name("givenName")).sendKeys("John");
		driver.findElement(By.name("middleName")).sendKeys("Henri");
		driver.findElement(By.name("familyName")).sendKeys("Wanka");
		// driver.findElement(By.id("checkbox-unknown-patient")).click();
		driver.findElement(By.id("next-button")).click();

		// Gender
		driver.findElement(By.xpath("//*[@id=\"gender-field\"]/option[1]")).click();
		driver.findElement(By.id("next-button")).click();

		// Birthdate
		driver.findElement(By.name("birthdateDay")).sendKeys("12");
		s = new Select(driver.findElement(By.name("birthdateMonth")));
		s.selectByVisibleText("July");
		driver.findElement(By.name("birthdateYear")).sendKeys("1995");
		driver.findElement(By.id("next-button")).click();

		// Estimated years
     	//driver.findElement(By.id("birthdateYears-field")).sendKeys("27");
 		//driver.findElement(By.id("birthdateMonths-field")).sendKeys("11");
   	    //driver.findElement(By.id("next-button")).click();
		
		// Address updation
		driver.findElement(By.id("address1")).sendKeys("kolbenacker 6");
		driver.findElement(By.id("address2")).sendKeys("Near Garden");
		driver.findElement(By.id("cityVillage")).sendKeys("Adliswil");
		driver.findElement(By.id("stateProvince")).sendKeys("Zurich");
		driver.findElement(By.id("country")).sendKeys("Switzerland");
		driver.findElement(By.id("postalCode")).sendKeys("526354");
		driver.findElement(By.id("next-button")).click();
		
		//Phone no update
		driver.findElement(By.name("phoneNumber")).sendKeys("526354");
		driver.findElement(By.id("next-button")).click();
		
        //Who is the patient related to
		
		s = new Select(driver.findElement(By.name("relationship_type")));
		s.selectByVisibleText("Parent");
		driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]")).sendKeys("Angel");
		driver.findElement(By.id("next-button")).click();
		
		//Confirm Submission
		driver.findElement(By.id("submit")).click();
		//driver.switchTo().alert().accept();
	    
	}

}
