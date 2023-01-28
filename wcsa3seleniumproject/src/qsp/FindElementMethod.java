package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("Bikes");
		Thread.sleep(3000);
		List<WebElement> suggestion= driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(WebElement suggest:suggestion)
		{
			String Bikes =suggest.getText();
			System.out.println(Bikes);
		}
	}

}
