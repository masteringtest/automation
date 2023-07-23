package openmrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Management {

	
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
		
		//data management
		driver.findElement(By.xpath("//*[@id=\"coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension\"]")).click();
        //Merge Record
		driver.findElement(By.xpath("//*[@id=\"coreapps-mergePatientsHomepageLink-app\"]")).click();
        
		//Search by ID
		
		driver.findElement(By.id("patient-search")).sendKeys("100");
		//two electronic records to merge.
		driver.findElement(By.id("patient1-text")).sendKeys("1001A7");
		Thread.sleep(2000);
		driver.findElement(By.id("patient2-text")).sendKeys("10065D");
		Thread.sleep(2000);
		driver.findElement(By.id("breadcrumbs")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-button")).click();
	
		driver.navigate().back();
	
		
	
	}

}
