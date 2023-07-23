package orangeHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcel {
	public void readExcel(WebDriver driver) throws Exception {

		// Excel Sheet
		FileInputStream file = new FileInputStream("C:\\Users\\ashi_\\Desktop\\automation\\poi.xlsx");
		// Excel File
		XSSFWorkbook w = new XSSFWorkbook(file);
		// Excel Sheet
		XSSFSheet s = w.getSheet("Hybridframwork");

		int size = s.getLastRowNum();
		System.out.println("no of data" + size);
		Operationalclass o = new Operationalclass();

		for (int i = 1; i <= size; i++)
		// data driven Framework

		{
			String username = s.getRow(i).getCell(1).getStringCellValue();
			String password = s.getRow(i).getCell(2).getStringCellValue();
			System.out.println(username + "\t\t" + password);
			try {
				// login
				for (int j = 1; j <= size; j++)// keyword driven framework
				{
					String key = s.getRow(j).getCell(0).getStringCellValue();
					if (key.equals("Maximize Brouser")) {
						o.maximizeBrowser(driver);
						System.out.println(key);
						Thread.sleep(2000);
					}
					if (key.equals("Enter URL")) {
						o.url(driver);
						System.out.println(key);
						Thread.sleep(2000);
					}
					if (key.equals("Enter Username")) {
						o.username(driver, username);
						System.out.println(key);
						Thread.sleep(2000);
					}
					if (key.equals("Enter Password")) {
						o.password(driver, password);
						System.out.println(key);
						Thread.sleep(2000);
					}

					if (key.equals("Click on Login Button")) {
						o.loginButton(driver);
						System.out.println(key);
						Thread.sleep(2000);
					} else if (key.equals("Click on Logout")) {
						o.logoutbutton(driver);
						System.out.println(key);
						Thread.sleep(3000);
						System.out.println("valid credential.");
						System.out.println("");
						s.getRow(i).createCell(4).setCellValue("valid Credential.");

					}
				}
			} catch (Exception e) {
				System.out.println("Invalid credential");
				System.out.println("***************");
				s.getRow(i).createCell(4).setCellValue("Invalid Credential.");
			}

		}
		o.closeBrowser(driver);
		FileOutputStream out = new FileOutputStream("C:\\Users\\ashi_\\Desktop\\automation\\poi.xlsx");
		w.write(out);
		w.close();
	}
}
