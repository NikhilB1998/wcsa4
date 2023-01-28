package ForPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
	
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		WebElement frameelement =driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameelement);
		driver.findElement(By.id("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("//input[@id='chat-fc-name']")).sendKeys("Nikhil");
		driver.findElement(By.id("//input[@id='chat-fc-email']")).sendKeys("nikhilrb3898@gmail.com");
		driver.findElement(By.id("//input[@id='chat-fc-phone']")).sendKeys("8378093149");
		
	}

}
