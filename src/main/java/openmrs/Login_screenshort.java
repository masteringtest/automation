package openmrs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_screenshort {

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
		Thread.sleep(2000);
		//driver.findElement(By.xpath(p.getProperty("Logout"))).click();

//		// For Isolation Ward
//		driver.findElement(By.id("username")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("Admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("Isolation Ward")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(p.getProperty("Logout"))).click();
//
//		// For Laboratory
//		driver.findElement(By.id("username")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("Admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("Laboratory")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(p.getProperty("Logout"))).click();
//
//		// For Outpatient Clinic
//		driver.findElement(By.id("username")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("Admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("Outpatient Clinic")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(p.getProperty("Logout"))).click();
//
//		// Pharmacy
//		driver.findElement(By.id("username")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("Admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("Pharmacy")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(p.getProperty("Logout"))).click();
//
//		// For Registration Desk
//		driver.findElement(By.id("username")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("Admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("Registration Desk")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginButton")).click();
		// Scroll
				JavascriptExecutor js = (JavascriptExecutor) driver;
				Thread.sleep(2000);

				// Till Bottom
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(2000);
				
				// Scroll Up
				js.executeScript("window.scrollTo(0, 0)");
				Thread.sleep(2000);
				
				File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f, new File("C:\\Users\\ashi_\\Desktop\\automation\\screenshot\\Blaze.png"));
				

		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

	}

}
