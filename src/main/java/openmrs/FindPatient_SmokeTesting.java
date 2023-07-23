package openmrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindPatient_SmokeTesting {

	public static void main(String[] args) throws IOException, InterruptedException {

		// WebDriverManager.chromedriver().setup();
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

		// login

		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		// Find A Patient Record
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/a[1]")).click();

		// Find Patient Record

		driver.findElement(By.id("patient-search")).sendKeys("100");
		// create object of action class

		Actions a = new Actions(driver);

		// mouse move over create list of web element
		List<WebElement> ls = driver
				.findElements(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody/tr[1]/td[1]"));

		// storing size
		int size = ls.size();

		for (int i = 2; i <= size; i++) {
			Thread.sleep(3000);

			System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div")).getText());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div")).click();
			driver.navigate().back();
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div"))).perform();
			Thread.sleep(2000);
			System.out.println("value of i" + i);
			Thread.sleep(3000);
			driver.close();
		}

	}
}
