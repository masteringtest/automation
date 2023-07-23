package igp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class LoginAndLogout {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\automation\\src\\main\\java\\igp\\Igpproperty.properties");
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Select s;

		// URL
		driver.get(p.getProperty("URLIGB"));
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//*[@id=\"user-menu\"]/div")).click();
		//driver.switchTo().alert().dismiss();
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
		Thread.sleep(1000);
		Actions a = new Actions(driver);

		List<WebElement> ls = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2]"));

		int size = ls.size();
		System.out.println("No of webelements" + size);

		// step4 for loop
		for (int i = 1; i <= size; i++) {
			// Wait
			Thread.sleep(2000);

			// Display Web Element Name
			System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + i + "]"))
					.getText());

			// Perform Mouse Hover
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + i + "]")))
					.click().perform();

			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("C:\\Users\\ashi_\\Desktop\\automation\\screenshot\\Blaze.jpg"));
			Files.copy(f, new File("./login.png"));
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"user-menu\"]/div")).click();

			Thread.sleep(2000);
			

       		//logout

			driver.findElement(By.xpath("//body/div[@id='acc-menu']/a[1]/span[1]")).click();

		}
	}
}
