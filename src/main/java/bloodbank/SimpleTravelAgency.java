package bloodbank;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SimpleTravelAgency {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver..driver",
				"C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Select s;
		Thread.sleep(2000);
		// Maximize Window:
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// URL:
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);

		// CHOOSE DEPARTURE CITY
		s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		s.selectByVisibleText("Boston");
		Thread.sleep(2000);

		// CHOOSE DESTINATION CITY
		s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		s.selectByVisibleText("Rome");
		Thread.sleep(2000);

		// find flight

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(3000);

		// choose flight
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(3000);

		// Details of passenger
		driver.findElement(By.id("inputName")).sendKeys("Pooja");
		Thread.sleep(2000);

		driver.findElement(By.id("address")).sendKeys("Gatway Tower,Amanora");
		Thread.sleep(2000);

		driver.findElement(By.id("city")).sendKeys("Pune");
		Thread.sleep(2000);

		driver.findElement(By.id("state")).sendKeys("Maharashtra");
		Thread.sleep(2000);

		driver.findElement(By.id("zipCode")).sendKeys("411011");
		Thread.sleep(2000);

		s = new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
		s.selectByVisibleText("American Express");
		Thread.sleep(2000);

		driver.findElement(By.id("creditCardNumber")).sendKeys("23568912");
		Thread.sleep(2000);

		driver.findElement(By.id("creditCardMonth")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		Thread.sleep(2000);

		driver.findElement(By.id("creditCardYear")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("creditCardYear")).sendKeys("2024");
		Thread.sleep(2000);

		driver.findElement(By.id("nameOnCard")).sendKeys("Pooja Shrivastva");
		Thread.sleep(2000);

		driver.findElement(By.id("rememberMe")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);

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
		//Files.copy(f, new File("C:\\Users\\ashi_\\Desktop\\automation\\screenshot\\Blaze.jpg"));
		Files.copy(f, new File("./SimleTravelAgency.png"));

		

	}

}


