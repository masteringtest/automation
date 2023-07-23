package igp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Buy_cake {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\automation\\src\\main\\java\\igp\\Igpproperty.properties");
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// URL
		driver.get(p.getProperty("URLIGB"));

		driver.findElement(By.xpath("//*[@id=\"user-menu\"]/div")).click();
		String usn1 = JOptionPane.showInputDialog("enter username");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[3]/div/div[2]/section/section/div/div[2]/form[1]/div[1]/div[1]/div/input"))
				.sendKeys(usn1);
		Thread.sleep(1000);
		String pwd1 = JOptionPane.showInputDialog("enter password");
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys(pwd1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"row-submit\"]/div/button")).click();
		Thread.sleep(2000);
		// search options
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cake");
		driver.findElement(By.xpath("//img[@alt='Search']")).click();
		Thread.sleep(2000);
		// all filters click
		driver.findElement(By.xpath("//div[@id='filters-section']//img")).click();
		// select cake or flower
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='checkbox-all_categories-flowersandcakes']")).click();
		driver.findElement(By.xpath("//img[@id='checkbox-all_categories-flowersandcakes-cakes']")).click();
		driver.findElement(By.xpath("//label[@for='all_categories-flowersandcakes-cakes-regularcakes']")).click();
		// select combo
		driver.findElement(By.xpath("//label[@for='combo-flowers']")).click();
		// weight
		driver.findElement(By.xpath("//label[@for='weight-1kg']")).click();
		// Flavour
		driver.findElement(By.xpath("//label[@for='flavour-chocolate']")).click();
		// Shape
		driver.findElement(By.xpath("//label[@for='shape-round']")).click();
		// Oocasion
		driver.findElement(By.xpath("//label[@for='occasion-birthday']")).click();
		// Personality
		driver.findElement(By.xpath("//label[@for='personality-romantic']")).click();
		// Gift To
		driver.findElement(By.xpath("//img[@id='checkbox-gift_to-women']")).click();

		driver.findElement(By.xpath("//div[@id='filters-section']//button[@id='closeaw']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//body/div[@id='site-wrapper']/div[1]/section[1]/div[1]/div[3]/div")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]")).click();
		// pincode
		driver.findElement(By.xpath("//input[@id='location-input']")).sendKeys("411036");

		// String date = "20";

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='show-Select_Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[4]/td[5]/a[1]")).click();
		driver.findElement(By.xpath("//button[@id='cal-Standard']")).click();

		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='timepicker']")));
		s1.selectByIndex(3);

		driver.findElement(By.xpath("//button[@id='add-cart']")).click();
		// cart screeshot
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[1]/a[3]/div[1]")).click();
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\ashi_\\Desktop\\automation\\screenshot\\Blaze.png"));
		// Files.copy(f, new File("./login.png"));
		driver.close();
		driver.quit();
	}

}
