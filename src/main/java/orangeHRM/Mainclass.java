package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver..driver","C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		// acess crome
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		// create object of readexcel class
		ReadExcel r = new ReadExcel();
		r.readExcel(driver);
	}

}