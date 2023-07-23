package igp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Rakhi {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\automation\\src\\main\\java\\igp\\Igpproperty.properties");
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// URL
		driver.get(p.getProperty("URLIGB"));
		
		Thread.sleep(2000);
		

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
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div")).click();
		// home category
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]")).click();
		Actions a = new Actions(driver);
		List<WebElement> js = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]"));

		int size1 = js.size();
		

		// step4 for loop
		for (int j = 1; j <= size1; j++) {
			// Wait
			Thread.sleep(2000);

			// Display Web Element Name
			System.out.println(
					driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2][" + j + "]")).getText());

			// Perform Mouse Hover
			a.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2][" + j + "]"))).click()
					.perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]")).click();
			Thread.sleep(2000);
			System.out.println();

			List<WebElement> ls = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2]"));

			int size = ls.size();
			System.out.println("Home page categories" + size);

			// step4 for loop
			for (int i = 1; i <= size; i++) {
				// Wait
				Thread.sleep(2000);

				// Display Web Element Name
				System.out.println(driver
						.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + i + "]")).getText());

				// Perform Mouse Hover
				a.moveToElement(
						driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + i + "]")))
						.click().perform();
				Thread.sleep(2000);
				System.out.println();

				driver.findElement(By.xpath("//*[@id=\"selection-panel\"]/div[2]/a[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2]/a[1]")).click();
				System.out.println();

			}

			driver.findElement(
					By.xpath("//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]")).click();
			List<WebElement> ls3 = driver.findElements(By.xpath(
					"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[3]/div[1]"));

			int size3 = ls.size();
			System.out.println("Home page categories" + size3);

			// step4 for loop
			for (int l = 1; l <= size; l++) {
				// Wait
				Thread.sleep(2000);

				// Display Web Element Name
				System.out.println(driver.findElement(By.xpath(
						"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[3]/div[1]["
								+ l + "]"))
						.getText());

				// Perform Mouse Hover
				a.moveToElement(driver.findElement(By.xpath(
						"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[3]/div[1]["
								+ l + "]")))
						.click().perform();

				driver.findElement(
						By.xpath("//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]"))
						.click();
				System.out.println();// for next line

				List<WebElement> ns = driver.findElements(By.xpath(
						"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[3]/div[1]"));

				int size4 = ns.size();
				System.out.println("Home page categories" + size4);

				// step4 for loop
				for (int m = 1; m <= size4; m++) {
					// Wait
					Thread.sleep(2000);

					// Display Web Element Name
					System.out.println(driver.findElement(By.xpath(
							"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[3]/div[1]["
									+ m + "]"))
							.getText());

					// Perform Mouse Hover
					a.moveToElement(driver.findElement(By.xpath(
							"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[3]/div[1]["
									+ m + "]")))
							.click().perform();

					Thread.sleep(2000);
					driver.findElement(By.xpath(
							"//body/div[@id='site-wrapper']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]"))
							.click();
					// domestic
					driver.findElement(By.xpath("//button[@id='address-domestic']")).click();
					// enter pincode
					driver.findElement(By.xpath("//input[@id='pincode']")).sendKeys("411036");
					// apply
					driver.findElement(By.xpath(
							"//body/div[@id='site-wrapper']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[2]/div[2]/div[2]/a[1]"))
							.click();

					driver.findElement(
							By.xpath("//body/div[@id='site-wrapper']/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]"))
							.click();

					driver.findElement(
							By.xpath("/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath(
							"//*[@id=\"site-wrapper\"]/div/section[1]/div[1]/div[2]/div[1]/div/div/div/ul/li/div[2]/div[2]/div[2]/div[1]"));
					Thread.sleep(2000);
					System.out.println("end");
					driver.close();

				}
			}

		}
	}
}
