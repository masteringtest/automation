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

public class ActiveVisit {

	public ActiveVisit() {
		// TODO Auto-generated constructor stub
	}

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

		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/a[2]")).click();

		driver.findElement(By.xpath("/html/body/div/div[3]/div/table/tbody/tr[1]/td[2]/a")).click();

		driver.findElement(By.id("patient-header-contactInfo")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[6]/div[1]/div/div[2]/span[3]/a")).click();

		// driver.findElement(By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")).click();
		driver.findElement(By.name("givenName")).clear();
		driver.findElement(By.name("givenName")).sendKeys("John");
		driver.findElement(By.name("middleName")).clear();
		driver.findElement(By.name("middleName")).sendKeys("Henri");
		driver.findElement(By.name("familyName")).clear();
		driver.findElement(By.name("familyName")).sendKeys("Wanka");
		// driver.findElement(By.id("checkbox-unknown-patient")).click();
		driver.findElement(By.id("next-button")).click();

		// Gender
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section/fieldset[2]/p/select/option[1]")).click();
		driver.findElement(By.id("next-button")).click();

		// Birthdate
		driver.findElement(By.name("birthdateDay")).sendKeys("12");
		s = new Select(driver.findElement(By.name("birthdateMonth")));
		s.selectByVisibleText("July");
		driver.findElement(By.name("birthdateYear")).sendKeys("1995");
		driver.findElement(By.id("next-button")).click();

		// cancel
		driver.findElement(By.id("cancelSubmission")).click();

		// submit button
		// driver.findElement(By.id("registration-submit")).click();

		// Patient header contact info
		driver.findElement(By.id("patient-header-contactInfo")).click();

		// edit address
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[6]/div[1]/div/div[4]/div/small/a")).click();

		// Edit addreSS
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys("kolbenacker 6");
		driver.findElement(By.id("address2")).clear();
		driver.findElement(By.id("address2")).sendKeys("Near Garden");
		driver.findElement(By.id("cityVillage")).clear();
		driver.findElement(By.id("cityVillage")).sendKeys("Adliswil");
		driver.findElement(By.id("stateProvince")).clear();
		driver.findElement(By.id("stateProvince")).sendKeys("Zurich");
		driver.findElement(By.id("country")).clear();
		driver.findElement(By.id("country")).sendKeys("Switzerland");
		driver.findElement(By.id("postalCode")).clear();
		driver.findElement(By.id("postalCode")).sendKeys("526354");
		driver.findElement(By.id("next-button")).click();

		// save form
		driver.findElement(By.id("save-form")).click();

		// cancel
		// driver.findElement(By.id("cancelSubmission")).click();

		// submit button
		// driver.findElement(By.id("registration-submit")).click();

		// Exit button

		driver.findElement(By.xpath("/html/body/div/div[3]/div/a[2]")).click();
		
		//mouse hover in General Actions
		Actions a=new Actions(driver);
		//create list of web element
				List<WebElement>ls=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[9]/div[3]/div/ul[1]"));
				
						
						//storing size
						int size=ls.size();
						System.out.println("No of web element:"+size);
						
						for(int i=1;i<=size;i++)
						{
							Thread.sleep(3000);
							
							System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[9]/div[3]/div/ul[1]")).getText());
							a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[9]/div[3]/div/ul[1][\"+i+\"]"))).perform();
							System.out.println("value of i"+i);
						}
						Thread.sleep(3000);
			}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


