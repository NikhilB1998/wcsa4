package ForPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='relative'][1]")).click();
		driver.findElement(By.xpath("//span[@class='text-sm'][1]']")).click();
		
	}

}
