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

public class AppSche_dropdownnavigation {

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

		// login

		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("Registration Desk")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

//		// Appointment Scheduling
    	driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/a[5]")).click();
//
//		// Manage service type
//		driver.findElement(By.id("appointmentschedulingui-manageAppointmentTypes-app")).click();
//
//		// New Service Type
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[1]/button")).click();
//
//		driver.findElement(By.id("name-field")).clear();
//
//		driver.findElement(By.id("name-field")).sendKeys("Gynecology");
//		driver.findElement(By.id("duration-field")).sendKeys("20");
//		driver.findElement(By.id("description-field")).sendKeys("Checkup for pregnancy");
//
//		// driver.findElement(By.linkText("Cancel")).sendKeys("Checkup for pregnancy");
//
//		driver.findElement(By.id("save-button")).click();
//		driver.navigate().back();
//		driver.navigate().back();
//
//		// Edit
//		driver.findElement(By.id("appointmentschedulingui-edit-General Medicine (New Patient)")).click();
//		///html/body/div/div[3]/div/div[2]/div[21]/table/tbody/tr[1]/td[4]/span/i[1]
//				////*[@id="appointmentschedulingui-edit-General Medicine"]
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//
//		// Delete no
//		driver.findElement(By.id("appointmentschedulingui-delete-General Medicine (New Patient)")).click();
//		
//		Thread.sleep(2000);
//		// not delete
//		// driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button[2]")).click();
//
//		// delete yes
//		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button[1]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.navigate().back();
		
		//Manage Provider Schedules
		driver.findElement(By.id("appointmentschedulingui-scheduleProviders-app")).click();
//		s = new Select(driver.findElement(By.xpath("//*[@id=\"filter-location\"]/select")));
//		Thread.sleep(2000);
//		s.selectByIndex(4);	
//		
//		//select services
		
		//click on view all type
		//driver.findElement(By.linkText("View all types")).click();
		driver.findElement(By.linkText("View all types")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"allAppointmentTypesModal\"]/div[2]/span")).click();
		driver.navigate().back();
		
		//Manage Appointments
		driver.findElement(By.id("appointmentschedulingui-manageAppointments-app")).click();
		driver.findElement(By.id("patient-search")).sendKeys("100");
		Thread.sleep(2000);
		
		//daily appointment
		driver.findElement(By.id("appointmentschedulingui-scheduledAppointments-app")).click();
		driver.findElement(By.xpath("//*[@id=\"filter-date\"]/span/i")).click();
		driver.findElement(By.xpath("//*[@id=\"datepicker-8-6186-32\"]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"filter-location\"]/select")).click();
		s = new Select(driver.findElement(By.xpath("//*[@id=\"filter-location\"]/select")));
		s.selectByIndex(4);	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"filter-provider\"]/select")).click();
		s = new Select(driver.findElement(By.xpath("//*[@id=\"filter-location\"]/select")));
		s.selectByIndex(4);	
		driver.findElement(By.xpath("//*[@id=\"filter-creator\"]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/selectmultipleappointmenttypes/div/div[1]/div[2]/a")).click();
		driver.navigate().back();
		
		
		//Appointment Requests
		
		
		driver.findElement(By.id("appointmentschedulingui-appointmentRequests-app")).click();
		driver.navigate().back();
	
		
		
		
	
		
		
	
		
		
	
	    
		
		
		
		
	}

}
