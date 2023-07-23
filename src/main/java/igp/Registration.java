package igp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Registration {

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
		// Registration(signup)
		driver.findElement(By.id("goto-signup")).click();
		// FILL

		s = new Select(driver.findElement(By.xpath("//*[@id=\"ctitle\"]")));
		s.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id(p.getProperty("Nameigb"))).sendKeys(p.getProperty("igbname"));
		Thread.sleep(2000);
		driver.findElement(By.id(p.getProperty("Country"))).sendKeys(p.getProperty("igbcountry"));
		Thread.sleep(2000);
		driver.findElement(By.id(p.getProperty("Mobile"))).sendKeys(p.getProperty("igbmobile"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("Email"))).sendKeys(p.getProperty("igbemail"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("Password"))).sendKeys(p.getProperty("igbpassword"));
		Thread.sleep(2000);
		// Scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		// Till Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		Thread.sleep(3000);

		WebElement we = driver.findElement(By.xpath(
				"//body/div[@id='site-wrapper']/div[1]/div[2]/section[1]/section[1]/div[1]/div[2]/form[2]/div[7]/div[1]/button[1]"));
		System.out.println("Registration.main()" + we.getText());
		Thread.sleep(3000);
		we.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(we).click();

		Thread.sleep(2000);

		// Till Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		// Scroll Up
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);

		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Files.copy(f1, new File("C:\\Users\\ashi_\\Desktop\\automation\\screenshot\\Blaze.jpg"));
		Files.copy(f1, new File("./login.png"));
//		// ------------------------------------------------------------------------------------------
//		// LOGIN WITH EMAILID
//	      //driver.navigate().back();
//	      //Thread.sleep(2000);
//			//driver.findElement(By.xpath("//*[@id=\"user-menu\"]/div")).click();
//			//Thread.sleep(3000);
//			String usn1=JOptionPane.showInputDialog("enter username");
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section/section/div/div[2]/form[1]/div[1]/div[1]/div/input")).sendKeys(usn1);
//			Thread.sleep(3000);
//			String pwd1=JOptionPane.showInputDialog("enter password");
//			Thread.sleep(3000);
//			driver.findElement(By.id("passwd")).sendKeys(pwd1);
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"row-submit\"]/div/button")).click();
//			Thread.sleep(3000);
//			
//			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			Files.copy(f, new File("C:\\Users\\ashi_\\Desktop\\automation\\screenshot\\Blaze.jpg"));
//			Files.copy(f, new File("./login.png"));
//			driver.navigate().back();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"user-menu\"]/div")).click();
//			
//			//login without password
//			
//			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section/section/div/div[2]/section/section/div/div[1]/a[1]")).click();
//		
//			Thread.sleep(2000);
//			String usn2=JOptionPane.showInputDialog("enter username");
//			Thread.sleep(2000);
//			driver.findElement(By.id("otp-email")).sendKeys(usn2);
//			Thread.sleep(2000);
//			
//			Thread.sleep(2000);
//			WebElement we1=driver.findElement(By.id("row-otp-login-submit"));
//			we1.click();
//			
//			driver.navigate().back();
//			
//			//logout
//			
//			driver.findElement(By.id("user-menu")).click();
//			driver.findElement(By.xpath("/html/body/div[8]/a")).click();
//			
//			
//			
//			
//
//	}
//
//}
}}