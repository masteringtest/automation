package orangeHRM;

//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Operationalclass {
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void url(WebDriver driver) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	public void username(WebDriver driver, String usn) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
	}

	public void password(WebDriver driver, String pwd) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}

	public void loginButton(WebDriver driver) {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


	public void welcomeAdmin(WebDriver driver) {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	}

	public void logoutbutton(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		Thread.sleep(2000);		
		driver.findElement(By.linkText("Logout")).click();
	}

	public void closeBrowser(WebDriver driver) {
		driver.close();
	}
}
