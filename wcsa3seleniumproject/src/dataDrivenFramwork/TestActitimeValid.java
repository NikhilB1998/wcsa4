package dataDrivenFramwork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeValid {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-qiqglar/login.do");
	    Flib flib=new Flib();
	   String validusername= flib.ReadExcelData("./data/Testdata.xlsx","testdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(validusername);
		String validpassword= flib.ReadExcelData("./data/Testdata.xlsx","testdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		String validpwd= flib.ReadExcelData("./data/Testdata.xlsx","testdata", 2, 0);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(validpwd);
		
		
	}

}
