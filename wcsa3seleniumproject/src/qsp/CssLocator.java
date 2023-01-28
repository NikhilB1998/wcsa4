package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("nik123");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[name='login']")).click();

}
}