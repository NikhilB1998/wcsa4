package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("nik123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'2HKlqd _3AWRsL')]")).click();
		Thread.sleep(2000);
		
		
		
	}

}
