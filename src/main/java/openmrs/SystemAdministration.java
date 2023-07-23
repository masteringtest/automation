package openmrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SystemAdministration {

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
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();

		// click on SystemAdministration
		driver.findElement(By
				.id("coreapps-systemadministration-homepageLink-coreapps-systemadministration-homepageLink-extension"))
				.click();
		//click on manage Extension
		driver.findElement(By.id("referenceapplication-manageExtensions-app")).click();
		Thread.sleep(2000);

		Actions a = new Actions(driver);
		// create list of web element
		List<WebElement> ls = driver.findElements(By.xpath("//*[@id=\"content\"]/table"));

		// storing size
		int size = ls.size();
		System.out.println("No of web element:" + size);

		for (int i = 1; i <= size; i++) {
			Thread.sleep(3000);

			System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/table")).getText());
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/table[\"+i+\"]"))).perform();
			// System.out.println("value of i"+i);
		}
		Thread.sleep(3000);
		//for disable
		driver.findElement(By.xpath("//*[@id=\"form-org.openmrs.module.coreapps.createVisit\"]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form-org.openmrs.module.coreapps.createVisit\"]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[2]/a")).click();

		
		 //Manage Apps
		// driver.findElement(By.id("referenceapplication-manageApps-app")).click();
		// driver.findElement(By.xpath("/html/body/header/nav/button")).click();
		// driver.findElement(By.xpath("/html/body/header/nav/button")).click();
		// *[@id="content"]/button
		// ADD APP DEFINATION
		driver.findElement(By.xpath("//*[@id=\"content\"]/button")).click();
		//APP ID REQUIRED
		driver.findElement(By.id("appId-field")).sendKeys("My application registration with address");
		driver.findElement(By.id("json-field")).sendKeys("My application registration with addressand some more info");
		//driver.findElement(By.id("save-button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-owa.metadatamapping\"]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"form-owa.metadatamapping\"]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[2]/a")).click();

		// Managae Global Properties
		driver.findElement(By.id("org-openmrs-module-adminui-globalProperties-app")).click();

		// Add New Global Properties
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/button")).click();
		driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/form/p[1]/input"))
				.sendKeys("allergy.co");
		driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/form/p[2]/textarea"))
				.sendKeys("In details");
		driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/form/p[3]/textarea"))
				.sendKeys("In details");
		// delete
		// driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/form/p[4]/button[2]")).click();
		// save
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/table/tbody/tr[1]/td[3]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/table/tbody/tr[1]/td[3]/a[2]/i"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[2]/a")).click();
		// delete
		// driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/form/p[4]/button[2]")).click();
		// save
		driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/form/p[4]/button[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"manage-system-settings\"]/ui-view/table/tbody/tr[1]/td[3]/a[1]/i"))
				.click();

		//driver.findElement(By.xpath("//*[@id=\"ngdialog2\"]/div[2]/div[2]/div/button[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"ngdialog2\"]/div[2]/div[2]/div/button[1]")).click();
        driver.navigate().back();
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
