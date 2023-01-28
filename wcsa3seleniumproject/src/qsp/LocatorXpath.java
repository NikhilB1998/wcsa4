package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {
	public static void main(String[] args) {
		//span[.='Men']/following-sibling::span[.='Women']
		//span[.='Baby & Kids']/following-sibling::span[.='Home & Furniture']
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
      //  driver.findElement(By.xpath("//div[text()='Tecno Spark 8 (Turquoise Cyan, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).click();
        //SamsungS22
		driver.findElement(By.xpath("//p[text()='C#']/ancestor::div[@class='card h-100 bg-transparent border-0']/ancestor::div[@class='row justify-content-center px-5 pb-5']")).click();
}
}